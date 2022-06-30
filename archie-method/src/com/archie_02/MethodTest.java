package com.archie_02;

// 设计一个方法打印两个数中的较大数
public class MethodTest {
    public static void main(String[] args) {
        getMax(10,20);
//        调用方法的时候，参数的个数和类型一定要匹配
        int a = 10;
        int b = 20;
        getMax(a,b);
    }


    public static void getMax(int a, int b) {
        if (a >= b) {
            System.out.println("较大的数是:"+a);
        } else {
            System.out.println("较大的数是:"+b);
        }
    }
}
