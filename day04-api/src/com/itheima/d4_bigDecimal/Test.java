package com.itheima.d4_bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * BigDecimal总结:
 * 作用: 解决浮点型运算时, 出现结果失真问题
 * 注意: 禁止使用new BigDecimal()构造器方法处理精度, 因为还是会失真. 应该使用BigDecimal.valueof(),
 *
 * @author Nisy
 * @date 2025-09-07 23:50
 */
public class Test {

    public static void main(String[] args) {
        /**
         * 目标: 掌握BigDecimal解决精度失真问题
         * BigDecimal: 用于解决浮点型运算时, 出现结果失真问题
         */

        // 0.1 + 0.2 != 0.3, 0.30000000000000004
        System.out.println(0.1 + 0.2);

        // 如何解决精度丢失问题? 答: BigDecimal


        // 1. 创建BigDecimal对象, 封装浮点型数据, 进行精度运算
        double a = 0.1;
        double b = 0.2;
        // 不推荐使用
        BigDecimal a1 = new BigDecimal(a);
        BigDecimal b1 = new BigDecimal(b);
        BigDecimal c1 = a1.add(b1);
        // 发现精度问题更验证了. 0.3000000000000000166533453693773481063544750213623046875
        System.out.println(c1);



        // 变成字符串就好了
        BigDecimal a2 = new BigDecimal(a + "");
        BigDecimal b2 = new BigDecimal(b + "");
        BigDecimal c2 = a2.add(b2);
        // 0.3
        System.out.println(c2);

        /**
         * 结论: public BigDecimal(double v), 不推荐使用
         * public BigDecimal(String val), 把string转字符串, 再转BigDecimal, 用封装好的, BigDecimal.valueOf(double val)
         */

        BigDecimal a3 = BigDecimal.valueOf(a);
        BigDecimal b3 = BigDecimal.valueOf(b);
        System.out.println(a3.add(b3));

        // 减法
        BigDecimal subtract = b3.subtract(a3);
        System.out.println(subtract);

        // 乘法
        BigDecimal multiply = a3.multiply(b3);
        System.out.println(multiply);

        /**
         * 除法: 也会存在精度问题
         */
        BigDecimal d1 = BigDecimal.valueOf(0.1);
        BigDecimal d3 = BigDecimal.valueOf(0.3);
        // 抛异常了, 因为BigDecimal必须要进行精度运算, 否则就会报错
        // BigDecimal res1 = d1.divide(d3);
        // System.out.println(res1);

        BigDecimal divide = d1.divide(d3, 2, RoundingMode.HALF_UP);
        System.out.println(divide);

        // 3. BigDecimal只是解决精度问题的手段, double才是目的
        double v = divide.doubleValue();
        System.out.println("v = " + v);


    }


}
