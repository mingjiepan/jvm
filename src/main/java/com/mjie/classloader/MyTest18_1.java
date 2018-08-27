package com.mjie.classloader;

/**
 * 测试根类加载器对类的加载（将class文件手动复制到 sun.boot.class.path 指定的目录下，见 {@link MyTest18}）
 * @author panmingjie
 * @date 2018/8/27 22:50
 */
public class MyTest18_1 {
    public static void main(String[] args) throws Exception {
        MyClassLoader loader1 = new MyClassLoader("loader1");
        loader1.setPath("D:\\tmp\\");

        Class<?> clazz = loader1.loadClass("com.mjie.classinit.MyTest2");
        System.out.println("hashcode : " + clazz.hashCode());
        System.out.println("class : " + clazz.getClassLoader());
    }
}
