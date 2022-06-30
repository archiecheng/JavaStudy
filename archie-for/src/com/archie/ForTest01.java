package com.archie;

// 输出 1~5
public class ForTest01 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println("-------------------");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("-------------------");
//        自增运算符
//        它在变量的后面表示变量的值+1
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("-------------------");
//        获取数据 5-1
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

