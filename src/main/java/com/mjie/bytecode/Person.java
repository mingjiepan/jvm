package com.mjie.bytecode;

/**
 * @author panmingjie
 * @date 2018/10/20 09:49
 */
public class Person {

    private int age = 10;

    public static String name = "hello world";

    public void echo() {
        System.out.println("hello world");
    }

    public synchronized int salary(int base) {
        echo();
        int result = 0;
        try {
            result = age * base;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        Person person = new Person();
        int salary = person.salary(20);
        System.out.println(salary);
    }
}

