package com.mjie.bytecode.invoke;

/**
 * @author panmingjie
 * @date 2018/10/27 13:54
 */
public class WorldTest {
    static class Fruit {
        public void echo() {
            System.out.println("fruit");
        }
    }
    static class Apple extends Fruit {
        @Override
        public void echo() {
            System.out.println("apple");
        }
    }

    static class Pear extends Fruit {
        @Override
        public void echo() {
            System.out.println("pear");
        }
    }

    public void echo(Fruit fruit) {
       fruit.echo();
    }

    public static void main(String[] args) {
        WorldTest worldTest = new WorldTest();

        Fruit fruit = new Fruit();
        worldTest.echo(fruit);

        fruit = new Apple();
        worldTest.echo(fruit);

        fruit = new Pear();
        worldTest.echo(fruit);
    }
}
