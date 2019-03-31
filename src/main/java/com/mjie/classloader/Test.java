package com.mjie.classloader;

import sun.misc.Cleaner;

/**
 * @author panmingjie
 * @date 2019/1/5 10:31
 */
public class Test {
    public static void main(String[] args) {
        Cleaner cleaner = Cleaner.create(null, new Runnable() {
            @Override
            public void run() {

            }
        });
        cleaner.clean();
    }
}
