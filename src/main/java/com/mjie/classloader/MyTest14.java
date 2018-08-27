package com.mjie.classloader;

import java.net.URL;
import java.util.Enumeration;

/**
 * @author panmingjie
 * @date 2018/8/12 09:15
 */
public class MyTest14 {
    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        String resourceName = "com/mjie/classloader/MyTest13.class";

        Enumeration<URL> resources = classLoader.getResources(resourceName);

        while (resources.hasMoreElements()) {
            System.out.println(resources.nextElement());
        }

        System.out.println("-----");

        Class<?> clazz = MyTest14.class;
        System.out.println(clazz.getClassLoader());

        clazz = String.class;
        System.out.println(clazz.getClassLoader());
    }
}
