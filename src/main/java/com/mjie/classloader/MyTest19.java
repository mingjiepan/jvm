package com.mjie.classloader;

import com.sun.crypto.provider.AESKeyGenerator;

/**
 * 测试扩展类加载器对类的加载,手动指定java.ext.dirs的值，java -Djava.ext.dirs=./ com.mjie.classloader.MyTest19
 * (进入D:\workplace\java\jvm\out\production\classes路径，用命令行的方式执行)
 *
 * @author panmingjie
 * @date 2018/8/27 23:04
 */
public class MyTest19 {
    public static void main(String[] args) {
        AESKeyGenerator generator = new AESKeyGenerator();

        System.out.println(generator.getClass().getClassLoader());
        System.out.println(MyTest19.class.getClassLoader());
    }
}
