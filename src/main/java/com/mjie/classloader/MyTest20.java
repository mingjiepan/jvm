package com.mjie.classloader;

import java.lang.reflect.Method;

/**
 * 理解不同命名空间加载类的情况
 * @author panmingjie
 * @date 2018/8/27 23:11
 */
public class MyTest20 {
    public static void main(String[] args) throws Exception {
        MyClassLoader loader1 = new MyClassLoader("loader1");
        MyClassLoader loader2 = new MyClassLoader("loader2");

        loader1.setPath("D:\\tmp\\");
        loader2.setPath("D:\\tmp\\");

        Class<?> clazz1 = loader1.loadClass("com.mjie.classloader.MyPerson");
        Class<?> clazz2 = loader2.loadClass("com.mjie.classloader.MyPerson");

        System.out.println(clazz1 == clazz2);
        System.out.println("--------------------------------");

        Object instance1 = clazz1.newInstance();
        Object instance2 = clazz2.newInstance();

        Method method = clazz1.getMethod("setMyPerson", Object.class);
        method.invoke(instance1, instance2);
    }
}
