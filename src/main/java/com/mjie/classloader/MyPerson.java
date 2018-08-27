package com.mjie.classloader;

/**
 * @author panmingjie
 * @date 2018/8/27 23:12
 */
public class MyPerson {
    private MyPerson myPerson;

    public void setMyPerson(Object object) {
        this.myPerson = (MyPerson) object;
    }
}
