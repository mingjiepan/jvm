package com.mjie.classloader;

import com.mjie.classinit.MyTest1;

/**
 * java cvf test.jar com/mjie/classinit/MyTest1.class  对MyTest1打jar包， 然后指定扩展类加载器的加载路径。
 * 再执行java -Djava.ext.dirs=./ com.mjie.classloader.MyTest21 查看结果。
 *
 * @author panmingjie
 * @date 2018/8/28 23:31
 */
public class MyTest21 {

    static {
        System.out.println("MyTest21 initializer");
    }

    public static void main(String[] args) {
        System.out.println(MyTest21.class.getClassLoader());
        System.out.println(MyTest1.class.getClassLoader());
    }
}
