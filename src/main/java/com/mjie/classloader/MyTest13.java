package com.mjie.classloader;

/**
 * 测试类加载器的父类加载器{@link ClassLoader},如果返回 null
 *
 * @author panmingjie
 */
public class MyTest13 {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();

        System.out.println(classLoader);

        while (classLoader != null) {
            classLoader = classLoader.getParent();
            System.out.println(classLoader);
        }
    }
}
