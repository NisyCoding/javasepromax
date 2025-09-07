package com.itheima.d3_math;

import java.io.IOException;
import java.util.Scanner;

/**
 * Runtime: 代表程序所在的运行环境,
 * 大白话: 可以理解成jre, jvm这些, 一个电脑只有一个jvm, 所以设计成了单例
 * Runtime是一个单例类
 * @author Nisy
 * @date 2025-09-07 16:37
 */
public class RuntimeTest {

    public static void main(String[] args) throws Exception {
        // getRuntime, 获取运行的单例对象

        // 1. 获取虚拟机对象
        Runtime jvm = Runtime.getRuntime();

        // 2. 终止当前允许的虚拟机
        // jvm.exit(0);

        // 3. 返回jvm虚拟机可用的处理器数
        int count = jvm.availableProcessors();
        System.out.println("处理器数量: " + count);

        // 4. 获取jvm中的内存总量, 单位是: 字节
        long totalMemory = jvm.totalMemory();
        System.out.println("jvm的内存总量: " + totalMemory / 1024.0 / 1024.0 + "MB");

        // 5. 返回jvm中的可用内存
        long freeMemory = jvm.freeMemory();
        System.out.println("jvm的可用内存: " + freeMemory / 1024/ 1024 + "MB");

        // 6. 启动命令, 开启某个程序, 并返回代表该程序的对象

        // 启动计算器(mac版本)
        Process jsq_mac = jvm.exec("open -a Calculator");

        Scanner sc = new Scanner(System.in);
        System.out.println("是否关闭y/n");
        String next = sc.next();
        if ("y".equals(next)) {
            // 关闭计算器
            jsq_mac.destroy();
        }


        // 启动计算器(win版本)
        // Process jsq_win = jvm.exec("calc");


    }

}
