package com.archie_06;

// 调用方法的时候 Java虚拟机会通过参数的不同来区分同名的方法
public class MethodDemo {
    public static void main(String[] args) {
        int result = sum(10,20);
        System.out.println(result);

        double result2 = sum(10,20);
        System.out.println(result2);

        int result3 = sum(10,20,30);
        System.out.println(result3);
    }

//    需求1: 求两个 int 类型数据的方法
    public static int sum(int a, int b) {
        return a + b;
    }

    //    需求2: 求两个 double 类型数据的方法
    public static double sum(double a, double b) {
        return a + b;
    }

    //    需求3: 求三个 int 类型数据的方法
    public static int sum(int a, int b,int c) {
        return a + b + c;
    }
}
