package com.archie;

public class OperatorDemo01 {
    public static void main(String[] args) {
//        定义三个 int 类型变量
        int i = 10;
        int j = 20;
        int k = 10;

//        等于: ==
        System.out.println(i == j);
        System.out.println(i == k);
        System.out.println("----------");

//        不等于
        System.out.println(i != j);
        System.out.println(i != k);
        System.out.println("----------");

//        大于
        System.out.println(i > j);
        System.out.println(i > k);
        System.out.println("----------");
//        大于等于
        System.out.println(i >= j);
        System.out.println(i >= k);
        System.out.println("----------");

//        千万不要把两个等于号写成赋值
        System.out.println(i = j);
    }
}
