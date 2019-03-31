package com.mjie.classinit;

/**
 * <ul>
 * <li>通过new一个对象，也是对类的主动使用，因此会导致类的初始化,
 * 注意类只会在首次主动使用时，才会进行初始化，因此只会进行一次初始化</li>
 * <li>对于数组实例来说，其类型时由jvm在运行期动态生成的，表示为[Lcom.mjie.classloader.MyParent4这种形式。
 * 动态生成的类型，其父类型就是Object</li>
 *
 * <li>对于数组来说，Javadoc经常将构成数组的元素为component，实际上就是将数组降低一个维度后的类型</li>
 * </ul>
 *
 * @author panmingjie
 */
public class MyTest4 {
    public static void main(String[] args) {
        MyParent4 myParent4 = new MyParent4();

        System.out.println("----");

        MyParent4[] parent4s = new MyParent4[1];
        //class [Lcom.mjie.classloader.MyParent4;
        System.out.println(parent4s.getClass());
        //class java.lang.Object
        System.out.println(parent4s.getClass().getSuperclass());

        System.out.println("----------");
        MyParent4[][] myParent4s = new MyParent4[1][1];
        //class [[Lcom.mjie.classloader.MyParent4;
        System.out.println(myParent4s.getClass());
        //class java.lang.Object
        System.out.println(myParent4s.getClass().getSuperclass());
        System.out.println("----------");

        int[] arr = new int[1];
        System.out.println(arr.getClass());
        System.out.println(arr.getClass().getSuperclass());
    }
}

class MyParent4 {
    static {
        System.out.println("MyParent4 static block");
    }
}
