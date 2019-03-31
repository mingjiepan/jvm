package com.mjie.classinit;

import java.util.UUID;

/**
 * 测试对类非编译期间能确定值的常量，与MyTest2对比
 * 当一个常量的值并非编译期间可以确定的，那么其值就不会被放到调用类的常量池中，这时在程序运行时，
 * 会导致主动使用这个常量所在的类，显然会导致这个类被初始化
 *
 * @author panmingjie
 */
public class MyTest3 {
    public static void main(String[] args) {
        System.out.println(MyParent3.STR);
    }
}

class MyParent3 {

    /**
     * str在编译期间是不知道常量str的值
     */
    public static final String STR = UUID.randomUUID().toString();

    static {
        System.out.println("MyParent3 static block");
    }
}