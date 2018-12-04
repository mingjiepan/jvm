package com.mjie.bytecode;

/**
 * 1. invokeinterface：调用接口中的方法，实际上是运行期决定的，决定到底调用实现该接口的哪个对象的特定方法。
 * 2. invokestatic：调用静态方法
 * 3. invokespecial：调用自己的私有方法、构造方法（<init>）以及父类的方法。
 * 4. invokevirtual：调用虚方法，运行期动态查找的过程
 * 5. invokedynamic：动态调用方法。
 *
 *
 * 静态解析的4种情形：
 * 1. 静态方法
 * 2. 父类方法
 * 3. 构造方法
 * 4. 私有方法（无法被重写）
 * 以上4类方法称为非虚方法，他们是在类加载阶段就可以将符号引用转换为直接引用的。
 *
 * @author panmingjie
 * @date 2018/10/21 14:26
 */
public class MyTest4 {

    public static void test() {
        System.out.println("test invoked");
    }

    public static void main(String[] args) {
        test();
    }
}
