package com.itheima.d1_stringbuilder;

import java.util.Arrays;

/**
 * @author Nisy
 * @date 2025-08-08 00:01
 */
public class Test3 {

    // 完成StringBuilder案例
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        // 打印地址
        System.out.println(arr);

        // 方式1
        System.out.println(Test3.toString(arr));
        // 方式2: 利用Arrays一个效果
        System.out.println(Arrays.toString(arr));
    }


    public static String toString(int[] arr) {
        if (null == arr) {
            return null;
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            String end = i == arr.length - 1 ? "" : ", ";
            sb.append(arr[i]).append(end);
        }
        sb.append("]");
        return sb.toString();
    }

}
