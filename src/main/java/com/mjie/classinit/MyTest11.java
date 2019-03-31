package com.mjie.classinit;

/**
 * 通过 子类类名.父类静态成员/方法 表示的是对父类的主动使用，不会对子类进行初始化
 *
 * @author panmingjie
 */
class Parent3 {
    static int a = 3;

    static {
        System.out.println("parent3 static block");
    }

    static void doSomething() {
        System.out.println("do someThing");
    }
}

class Child3 extends Parent3 {
    static {
        System.out.println("child3 static block");
    }
}

public class MyTest11 {
    public static void main(String[] args) {
        System.out.println(Child3.a);
        Child3.doSomething();
    }
}
