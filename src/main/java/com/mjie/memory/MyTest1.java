package com.mjie.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * 虚拟机栈：Stack Frame 栈帧：线程私有的：局部变量表
 * 程序计数器（program counter）:线程私有的，字节码行号
 * 堆（heap）：jvm管理的最大一块内存空间，与堆相关的一个重要概念是垃圾收集器，现代几乎所有的垃圾收集器都是采用的分代收集算法，
 * 所以，堆空间也基于这一点进行了相应的划分：新生代与老年代。Eden空间，From Survivor空间与To Survivor空间。
 * 本地方法栈：主要用于处理本地方法
 * 方法区（method area）：存储元信息（常量、Class类）。永久代（Permanent Generation，与方法区不是一个概念），从JDK1.8开始，已经废弃了永久代，使用元空间（meta space）
 * 运行时常量池：方法区的一部分内容，在字节码章节
 * 直接内存：Direct Memory，与Java nio密切相关，JVm通过堆上的DirectByteBuffer来操作直接内存。
 *
 *
 * 关于Java对象创建的过程
 * new关键字创建对象的3个步骤
 * 1. 在堆内存中创建出对象的实例
 * 2. 为对象的实例成员变量赋初值
 * 3. 将对象的引用返回
 *
 * 指针碰撞（前提是堆中的空间通过一个指针进行分割，一侧是已经被占用的空间，另一侧是未被占用的空间），部分对象经过垃圾收集后并不会进行移动，
 * 从而使内存空间的已被使用和未被使用交织在一起，这时需用空间列表方式进行对象的分配
 * 空闲列表（前提是堆内存空间中已被使用与未被使用的空间是交织在一起的，这时，虚拟机就需要通过一个列表来记录哪些空间是可以使用的，哪些空间是
 * 已被使用的，接下来找出来可以容纳下新创建对象的且未被使用的空间，在此空间存放该对象，同时还要修改列表上的记录）
 *
 * 对象在内存中的布局
 * 1. 对象头
 * 2. 实例数据（即我们在一个类中所声明的各项信息）
 * 3. 对齐填充（可选），占位符的作用
 *
 * 引用访问对象的方式：
 * 1. 使用句柄的方式
 * 2. 使用直接指针的方式
 *
 * 堆内存溢出
 *
 * @author panmingjie
 * @date 2018/10/22 23:04
 */
public class MyTest1 {
    public static void main(String[] args) {
        List<MyTest1> list = new ArrayList<>();
        for(;;) {
            list.add(new MyTest1());
            System.gc();
        }
    }
}
