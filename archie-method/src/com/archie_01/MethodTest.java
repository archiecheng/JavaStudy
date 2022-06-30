package com.archie_01;

// 打印两个数中的较大数
public class MethodTest {
    public static void main(String[] args) {
        getMax();
    }

    public static void getMax() {
        int a = 10;
        int b = 20;
        if (a >= b) {
            System.out.println("较大的数是"+ a);
        } else {
            System.out.println("较大的数是"+ b);
        }
    }
}
