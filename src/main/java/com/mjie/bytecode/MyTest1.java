package com.mjie.bytecode;

import java.util.Objects;

/**
 * @author panmingjie
 * @date 2018/9/17 22:37
 */
public class MyTest1 implements MyInterface1, MyInterface2 {

    private int a = 1;

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean equals(MyTest1 myTest1) {
        return false;
    }

    public static void main(String[] args) {
        int hashCode = Integer.hashCode(1);
        System.out.println(hashCode);
        System.out.println(Objects.hashCode("a"));
        System.out.println(Objects.hashCode("a"));
    }
}
