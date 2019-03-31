package com.mjie.classinit;

/**
 * @author panmingjie
 */
class Parent {
    static int a = 1;

    static {
        System.out.println("parent static block");
    }
}

class Child extends Parent {
    static int b = 4;

    static {
        System.out.println("child static block");
    }
}

public class MyTest9 {
    static {
        System.out.println("MyTest9 static block");
    }

    public static void main(String[] args) {
        System.out.println(Child.b);
    }
}
