package com.mjie.classloader;

/**
 * @author panmingjie
 * @date 2018/8/26 22:31
 */
public class MySample {

    public MySample() {
        System.out.println("mySample is loaded by : " + this.getClass().getClassLoader());
        new MyCat();

        System.out.println("from mySample : " + MyCat.class);
    }

}
