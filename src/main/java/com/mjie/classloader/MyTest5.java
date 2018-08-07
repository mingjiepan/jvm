package com.mjie.classloader;

import java.util.UUID;

/**
 * <pre>
 *     1. 当一个接口在初始化时，并不要求其父接口都完成初始化
 *     2. 当使用一个类的静态成员时，若静态成员的值在编译期能确定且是用final修饰时，那么使用这个静态成员所在的类会将
 *     这个静态变量的值加载到自己的常量池中，因此不会对静态成员变量所在的类进行加载，更不会进行初始化；若静态成员不是final修饰时，
 *     那么会对这个静态成员所在的类进行加载（包括父接口和父类也会进行加载），并且对类进行初始化，若这个类有父类，则优先初始化父类，
 *     若这个类没有父类有父接口，但是并不会对父接口进行初始化。
 *     3. 当使用一个接口的静态成员时，若静态成员的值在编译器能确定，那么使用这个静态成员所在的类会将这个静态成员的值加载到自己的常量池
 *     中，因此不会对静态成员所在的接口进行加载，若是在编译期不能确定，那么会在运行时侯对接口进行加载(包括父接口)，且会对接口进行初始化，
 *     但是不会对父接口进行初始化
 * </pre>
 *
 * @author panmingjie
 */
public class MyTest5 {
    public static void main(String[] args) {
        System.out.println(MyChild5.str);
    }
}

interface MyParent5 {
    public static int a = 5;
}

interface MyChild5 extends MyParent5 {
    public static final int b = 6;
    String str = UUID.randomUUID().toString();
}


