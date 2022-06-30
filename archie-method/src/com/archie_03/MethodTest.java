package com.archie_03;

public class MethodTest {
    public static void main(String[] args) {
//        int max = getMax(10,20);
//        System.out.println(max);
        int max = getMax(10, 20);// .var 的使用, 它能够帮我们自动补齐左边的内容
        System.out.println(max); // max.sout 能够把max变量放到输出语句中
        System.out.println(getMax(10,20));
    }

    public static int getMax(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }
}
