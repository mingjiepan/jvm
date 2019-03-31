package com.mjie.memory;

/**
 * 死锁的检查
 * @author panmingjie
 * @date 2019/3/24 11:26
 */
public class MyTest3 {
    public static void main(String[] args) {
        new Thread(() -> A.method(), "threadA").start();
        new Thread(() -> B.method(), "threadB").start();
    }
}

class A {
    public static synchronized void  method() {
        System.out.println("method from A");
        try {
            Thread.sleep(5000);
            B.method();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class B {
    public static synchronized void  method() {
        System.out.println("method from B");
        try {
            Thread.sleep(5000);
            A.method();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}