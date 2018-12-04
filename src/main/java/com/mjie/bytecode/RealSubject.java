package com.mjie.bytecode;

/**
 * @author panmingjie
 * @date 2018/10/21 20:07
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("from real subject");
    }
}
