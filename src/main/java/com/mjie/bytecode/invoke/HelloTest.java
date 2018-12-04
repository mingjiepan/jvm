package com.mjie.bytecode.invoke;

/**
 * @author panmingjie
 * @date 2018/10/27 13:43
 */
public class HelloTest {

    static class Fruit {}
    static class Apple extends Fruit {}
    static class Pear extends Fruit {}

    public void echo(Fruit fruit) {
        System.out.println("fruit");
    }

    public void echo(Apple apple) {
        System.out.println("apple");
    }

    public void echo(Pear pear) {
        System.out.println("pear");
    }

    public static void main(String[] args) {
        HelloTest helloTest = new HelloTest();

        Fruit fruit = new Fruit();
        helloTest.echo(fruit);

        fruit = new Apple();
        helloTest.echo(fruit);

        fruit = new Pear();
        helloTest.echo(fruit);
    }
}
