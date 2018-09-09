package com.mjie.classloader;

/**
 * @author panmingjie
 * @date 2018/9/4 22:52
 */
public class MyTest24 implements Runnable {

    private Thread thread;

    public MyTest24() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        ClassLoader classLoader = this.thread.getContextClassLoader();
        this.thread.setContextClassLoader(classLoader);
        System.out.println("class :" + classLoader.getClass());
        System.out.println("parent:" + classLoader.getParent().getClass());
    }

    public static void main(String[] args) {
        new MyTest24();
    }
}
