package com.archie_01;

public class MethodDemo {
    public static void main(String[] args) {
//        调用方法
        isEvenNumber();
    }


//    定义一个方法, 判断是否为偶数
    public static void isEvenNumber() {
        int number = 10;
        number = 9;
        if (number % 2 == 0) {
            System.out.println(number + "是偶数");
        } else {
            System.out.println(number + "不是偶数");
        }
    }


}
