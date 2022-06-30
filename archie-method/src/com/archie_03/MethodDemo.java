package com.archie_03;

// 带返回值的方法的定义和调用

public class MethodDemo {
    public static void main(String[] args) {
        boolean flag = isEvenNumber(10);
        System.out.println(flag);

//        if (flag) {
//            System.out.println("是偶数就输出这句话");
//        }
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
