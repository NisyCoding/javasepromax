package com.itheima.d1_staticfield;

/**
 * @author Nisy
 * @date 2025-07-15 23:59
 */
public class Student {

    /**
     * 类变量: 有static修饰, 属于类, 内存中只加载一份, 可以被类和类的全部对象共享访问
     */
    static String name;

    /**
     * 实例成员变量(对象变量): 无static修饰, 属于每个对象的, 必须用对象触发访问
     */
    int age;

}
