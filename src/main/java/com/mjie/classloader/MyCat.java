package com.mjie.classloader;

/**
 * @author panmingjie
 * @date 2018/8/26 22:30
 */
public class MyCat {
    public MyCat() {
        System.out.println("mycat is loaded by " + this.getClass().getClassLoader());

        System.out.println("from mycat : " + MySample.class);
    }
}
