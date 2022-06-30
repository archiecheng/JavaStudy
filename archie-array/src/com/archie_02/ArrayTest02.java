package com.archie_02;

/*
*
*   获取最大值
*
* */
public class ArrayTest02 {
    public static void main(String[] args) {
//        定义数组
        int[] arr = {12,48,98,73,60};
//        定义变量max存储最大值, 取第一个数据为变量的初始值
        int max = arr[0];

//        与数组中剩余数据逐个比对, 每次比对将最大值保存到变量 max 中
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
//        循环结束后输出变量 max 的值
        System.out.println("max:" + max);

    }
}
