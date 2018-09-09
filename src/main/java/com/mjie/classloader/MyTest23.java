package com.mjie.classloader;

/**
 * 当前类加载器(current classloader)
 * 每个类都会使用自己的类加载器（即加载自身的类加载器）去加载其他类（指的是所依赖的类），
 * 如果Class X引用了Class Y，那么Class X的类加载器就会去加载Class Y（前提是Class Y尚未被加载）
 *
 * 线程上下文类加载器（ContextClassLoader）
 * 线程上下文类加载器是从jdk1.2开始引入的，类Thread中的getContextClassLoader()与setContextClassLoader(ClassLoader cl)
 * 分别用来获取和设置上下文类加载器。
 *
 * 如果没有通过setContextClassLoader(ClassLoader cl)进行设置的话，线程将继承其父线程上下文类加载器。
 * Java应用运行时的初始线程的上下文类加载器是系统类加载器（默认是AppClassLoader）。在线程中运行的代码可以通过该类加载器来加载类与资源。
 *
 * 线程上下文类加载器的重要性：
 *
 * SPI （Service Provider Interface）
 * 父ClassLoader可以使用当前线程Thread.currentThread().getContextLoader()所指定的classLoader加载的类。
 * 这就改变了父ClassLoader不能使用子ClassLoader或是其他没有直接父子关系的ClassLoader加载的类的情况，即改变了双亲委托模型。
 *
 *
 * 线程上下文类加载器就是当前线程的Current ClassLoader。
 *
 * 在双亲委托模型下，类加载是由下至上的，即下层的类加载器会委托上层进行加载。但是对于spi来说，有些接口是Java核心库所提供的，
 * 而Java核心库是由启动类加载器来加载的，而这些接口的实现却来自于不同的jar包（厂商提供），Java的启动类加载器是不会加载其他
 * 来源的jar包，这样传统的双亲委托模型就无法满足spi的要求，而通过给当前线程设置上下文类加载器，就可以由设置的上下文类加载器
 * 来实现对于接口实现类的加载。
 *
 * @author panmingjie
 * @date 2018/9/3 23:01
 */
public class MyTest23 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getContextClassLoader());
        System.out.println(Thread.class.getClassLoader());
    }
}
