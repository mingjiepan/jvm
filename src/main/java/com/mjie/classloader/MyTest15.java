package com.mjie.classloader;

/**
 * @author panmingjie
 * @date 2018/8/13 23:10
 */
public class MyTest15 {
    public static void main(String[] args) {
        String[] str = new String[2];

        System.out.println(str.getClass());
        System.out.println(str.getClass().getClassLoader());

        System.out.println("----------");

        MyTest15[] myTest15 = new MyTest15[2];
        System.out.println(myTest15.getClass());
        System.out.println(myTest15.getClass().getClassLoader());

        System.out.println("-----------");

        int[] ints = new int[2];
        System.out.println(ints.getClass());
        System.out.println(ints.getClass().getClassLoader());
    }
}
