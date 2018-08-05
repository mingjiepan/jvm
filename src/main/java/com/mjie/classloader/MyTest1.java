package com.mjie.classloader;

/**
 * 测试对类的主动使用，类初始化的情况
 * <p>对于静态字段来说，只有直接定义可该字段的类才会被初始化
 * 当一个类在初始化时，要求其父类全部都已经初始化完毕了</p>
 *
 * -XX: +TraceClassLoading：用于追踪类的加载信息并打印出来
 * @author panmingjie
 */
public class MyTest1 {
    public static void main(String[] args) {
        //情况1：通过子类直接访问父类的静态成员，那么是对父类MyParent1的主动使用，
        // 因此MyChild1不会被初始化，也就是static代码块不会被执行。但是MyChild1被加载了（虚拟机没有规定，看虚拟机自己的实现情况）
        System.out.println(MyChild1.str);

        //情况2：访问MyChild1的静态成员，那么是对MyChild1类的主动使用，因此其父类需要先初始化，再初始化子类的
        System.out.println(MyChild1.str2);
    }
}


class MyParent1 {

    //注意，这边不是final的
    public static String str = "hello world";

    static {
        System.out.println("myParent1 static block");
    }
}

class MyChild1 extends MyParent1 {

    public static String str2 = "welcome";

    static {
        System.out.println("myChild1 static block");
    }
}
