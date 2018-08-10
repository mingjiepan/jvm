package com.mjie.classloader;

/**
 * @author panmingjie
 */
public class MyTest7 {
    public static void main(String[] args) throws Exception {
        Class<?> forName = Class.forName("java.lang.String");
        //返回null，表示类加载器是根类加载器
        System.out.println(forName.getClassLoader());

        Class<?> clazz = Class.forName("com.mjie.classloader.C");
        //Launcher$AppClassLoader@18b4aac2
        System.out.println(clazz.getClassLoader());
    }
}



class C {

}