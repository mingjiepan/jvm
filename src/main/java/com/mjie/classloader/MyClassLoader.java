package com.mjie.classloader;

import java.io.*;

/**
 * @author panmingjie
 * @date 2018/8/26 09:58
 */
public class MyClassLoader extends ClassLoader {
    private String classLoaderName;

    private String path;

    private final String fileExtension = ".class";

    public void setPath(String path) {
        this.path = path;
    }

    public MyClassLoader(String classLoaderName) {
        super(); //系统类加载器作为该类加载器的父加载器
        this.classLoaderName = classLoaderName;
    }

    public MyClassLoader(ClassLoader parent, String classLoaderName) {
        super(parent);//显示指定该类加载器的父加载器
        this.classLoaderName = classLoaderName;
    }

    /**
     * 将类设置为系统类加载器，为什么要有这个构造器，请查看这个
     * {@link SystemClassLoaderAction#run()}
     * @param loader 系统默认的类加载器，一般为appClassLoader
     */
    public MyClassLoader(ClassLoader loader) {
        super(loader);
    }

    @Override
    protected Class<?> findClass(String className) {

        System.out.println("findClass invoked : " + className);
        System.out.println("classloader name : " + this.classLoaderName);

        byte[] data = this.loadClassData(className);
        return this.defineClass(className, data, 0, data.length);
    }

    private byte[] loadClassData(String className) {

        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;
        try {
            className  = className.replace(".", "/");
            is = new FileInputStream(new File(this.path + className + this.fileExtension));
            baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];
            int length;
            while (-1 != (length = is.read(buffer))) {
                baos.write(buffer, 0, length);
            }

            data = baos.toByteArray();

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                is.close();
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }
}
