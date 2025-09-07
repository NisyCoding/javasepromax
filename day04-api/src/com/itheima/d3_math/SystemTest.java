package com.itheima.d3_math;

/**
 * System: 代表程序所在的系统, 也是一个工具类
 * @author Nisy
 * @date 2025-09-07 16:26
 */
public class SystemTest {

    public static void main(String[] args) {

        // System.exit(): 终止当前允许的虚拟机. 禁止使用
        System.exit(0); // 0: 代表正常终止, 非0状态码代表异常终止,

        System.out.println("123");

        /**
         * System.currentTimeMillis(): 获取当前系统的时间毫秒值, 主要用于性能分析, 输出方法的执行时间
         * 时间毫秒值: 指的是从1970年1月1日 00:00:00走到此刻的总毫秒数 1s = 1000s
         * 为啥选择"1970年1月1日"呢?
         * 答: 因为是c语言的生日
         */
        System.out.println(System.currentTimeMillis());
    }
}
