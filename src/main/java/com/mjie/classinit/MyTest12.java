package com.mjie.classinit;

/**
 * 调用Class.forName获取一个Class对象时，会导致对类的初始化
 * 调用ClassLoader类的loadClass方法加载一个类，并不是对类的主动使用，因此不会导致对类的初始化
 * @author panmingjie
 */

class CL {
    static {
        System.out.println("class CL");
    }
}

public class MyTest12 {
    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        Class<?> clazz = classLoader.loadClass("com.mjie.classinit.CL");
        System.out.println(clazz);

        System.out.println("------------------");

        clazz = Class.forName("com.mjie.classinit.CL");

        System.out.println(clazz);
    }
}
