package com.itheima.d2_stringjoiner;

import com.itheima.d1_stringbuilder.Test3;

import java.util.StringJoiner;

/**
 * @author Nisy
 * @date 2025-08-08 00:20
 */
public class Test {

    public static void main(String[] args) {
        /**
         * StringJoiner效率跟StringBuilder效率一样高, 只是在某些特定场景下, 代码更加方便
         */
        int[] arr = {1, 2, 3};

        System.out.println(Test.toString(arr));
    }

    public static String toString(int[] arr){
        if (null == arr) {
            return null;
        }
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(String.valueOf(arr[i]));
        }

        return sj.toString();
    }



}

