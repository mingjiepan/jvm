package com.mjie.bytecode;

/**
 * 现在jvm在执行Java代码时候，通常都会将解释执行与编译执行二者结合起来进行。
 * 所谓解释执行，就是通过解释器来读取字节码，遇到相应的指令就去执行该指令。
 * 所谓编译执行，就是通过即时编译器（just in time，JIT）将字节码转换为本地机器码来执行；现在jvm会根据代码热点来生成相应的本地机器码。
 * <p>
 * 基于栈的指令集与基于寄存器的指令集之间的关系：
 * 1. jvm执行指令时所采取的方式是基于栈的指令集。
 * 2. 基于栈的指令集主要的操作有入栈和出栈两种。
 * 3. 基于栈的指令集的优势在于它可以在不同平台之间移植，而基于寄存器的指令集是与硬件架构紧密关联的，无法做到可移植。
 * 4. 基于栈的指令集的缺点在于完成相同的操作，指令数量通常要比基于寄存器的指令集数量要多；基于栈的指令集是在内存中完成操作的，而基于寄存器的指令集是直接由CPU
 * 来执行的，它是在高速缓冲区中进行执行的，速度要快很多，虽然虚拟机可以采用一些优化手段，但总体来说，基于栈的指令集的执行速度要慢一些。
 * <p>
 * 例子：2-1
 * 对应的字节码指令：
 * 1. iconst_1
 * 2. iconst_2
 * 3. isub
 * 4. istore_0
 *
 * @author panmingjie
 * @date 2018/10/21 17:23
 */
public class MyTest8 {
    public int myCalculate() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int result = (a + b - c) * d;
        return result;
    }

    public static void main(String[] args) {
        MyTest8 test8 = new MyTest8();
        int calculate = test8.myCalculate();
        System.out.println(calculate);
    }
}
