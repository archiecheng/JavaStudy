package com.archie_02;

// 带参数方法的定义和调用

public class MethodDemo {
    public static void main(String[] args) {
//        字面量值调用
        isEvenNumber(10);
        isEvenNumber(9);
//        变量的调用
        int number = 11;
        isEvenNumber(number);
        number = 12;
        isEvenNumber(number);
    }



    public static void isEvenNumber(int number) {
        if (number % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }



}
