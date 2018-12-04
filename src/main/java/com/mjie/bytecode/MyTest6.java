package com.mjie.bytecode;

/**
 * 方法的动态分派
 *
 * 方法的动态分派涉及到一个重要概念：方法接收者。
 *
 * invokevirtual字节码指令的多态查找流程
 * 1. 到操作数栈顶寻找栈顶元素所指向对象的实际类型
 * 2. 在寻找到的实际类型的对象寻找特定的方法（与常量池中方法的名称和描述符相同的），那么直接调用
 * 3. 如果找不到，则找父类的对应的特定方法，若找到，则执行。若找不到，则抛异常。
 *
 * 比较方法重载和方法重写，我们可以得到这样一个结论：方法重载是静态的，是编译期行为；方法重写是动态的，是运行期行为。
 *
 * @author panmingjie
 * @date 2018/10/21 15:09
 */
class Fruit {
    public void test() {
        System.out.println("fruit");
    }
}

class Apple extends Fruit {
    @Override
    public void test() {
        System.out.println("apple");
    }
}

class Orange extends Fruit {
    @Override
    public void test() {
        System.out.println("Orange");
    }
}

public class MyTest6 {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit orange = new Orange();

        apple.test();
        orange.test();

        apple = new Orange();
        apple.test();
    }
}
