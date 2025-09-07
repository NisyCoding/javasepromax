package com.itheima.d3_math;

/**
 * 了解Math类提供的常见方法
 * @author Nisy
 * @date 2025-09-07 15:40
 */
public class MathTest {

    public static void main(String[] args) {
        // Math.abs: 取参数绝对值
        System.out.println(Math.abs(-12)); // 12
        System.out.println(Math.abs(123)); // 123
        System.out.println(Math.abs(-3.14)); // 3.14


        // Math.ceil: 向上取整
        System.out.println(Math.ceil(4.00001)); // 5
        System.out.println(Math.ceil(4.0)); // 4

        // Math.floor: 向下取整
        System.out.println(Math.floor(4.999)); // 4
        System.out.println(Math.floor(4.0)); // 4

        // Math.round: 四舍五入
        System.out.println(Math.round(3.499)); // 3
        System.out.println(Math.round(3.50001)); // 4
        
        // Math.max: 获取2个int值中较大的
        System.out.println(Math.max(10, 20)); // 20
        // Math.min获取2个int值中较小的
        System.out.println(Math.min(10, 20)); // 10

        // Math.pow: 返回a的b次幂
        System.out.println(Math.pow(2, 3)); // 8.0
        System.out.println(Math.pow(3, 2)); // 9.0

        // 返回[0.0, 1.0)的随机数, 包前不包后
        System.out.println(Math.random());
    }
}
