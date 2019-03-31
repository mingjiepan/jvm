package com.mjie.classloader;

/**
 * @author panmingjie
 * @date 2018/8/26 10:44
 */
public class MyTest16 {
    public static void main(String[] args) throws Exception {
        MyClassLoader loader1 = new MyClassLoader("loader1");
        loader1.setPath("D:\\tmp\\");

        Class<?> clazz = loader1.loadClass("com.mjie.classinit.MyTest1");

        System.out.println("clazz : " + clazz.hashCode());
        Object object = clazz.newInstance();
        System.out.println(object);

        System.out.println("--------------------");

        MyClassLoader loader2 = new MyClassLoader(loader1, "loader2");
        loader2.setPath("D:\\tmp\\");

        Class<?> clazz2 = loader2.loadClass("com.mjie.classinit.MyTest1");

        System.out.println("clazz : " + clazz2.hashCode());
        Object object2 = clazz2.newInstance();
        System.out.println(object2);

        System.out.println("--------------------");

        MyClassLoader loader3 = new MyClassLoader("loader3");
        loader3.setPath("D:\\tmp\\");

        Class<?> clazz3 = loader3.loadClass("com.mjie.classinit.MyTest1");

        System.out.println("clazz : " + clazz3.hashCode());
        Object object3 = clazz3.newInstance();
        System.out.println(object3);
    }
}
