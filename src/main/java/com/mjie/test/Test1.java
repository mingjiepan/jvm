package com.mjie.test;

/**
 * @author panmingjie
 * @date 2018/8/12 10:07
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.mjie.test.Test1");
        System.out.println(clazz.getClassLoader());

        Test1 t = new Test1();
        Test1[] test1s = new Test1[]{t};
        System.out.println(test1s.getClass().getClassLoader());
    }
}
