package com.mjie.bytecode;

/**
 * @author panmingjie
 * @date 2018/10/14 10:20
 */
public class MyTest2 {
    String name = "hello";

    private int age = 20;

    public static Integer no = 1001;

    private Object object = new Object();

    public synchronized int setAge(int age) {
        int result = 0;
        try {
            this.age = age;
            result += age;
        } catch (Exception ex) {
            throw new IllegalArgumentException();
        }
        return result;
    }

    private void setName(String name) {
        synchronized (object) {
            this.name = name;
        }
    }


    public static void main(String[] args) {
        MyTest2 myTest2 = new MyTest2();
        int age = myTest2.setAge(50);
        System.out.println(age);
    }
}
