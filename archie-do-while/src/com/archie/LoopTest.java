package com.archie;

// 三种循环的区别
public class LoopTest {
    public static void main(String[] args) {
//        for 循环
        for (int i = 3; i < 3; i++) {
            System.out.println("我爱Java");
        }
        System.out.println("------------------");

//        while 循环
        int j = 3;
        while(j < 3) {
            System.out.println("我爱Java");
            j++;
        }
        System.out.println("------------------");

//        do...while 循环
        int k = 3;
        do {
            System.out.println("我爱Java");
        } while (k < 3);

//        死循环
//        for (;;) {
//            System.out.println("for...");
//        }

//        while (true) {
//            System.out.println("while...");
//        }

//        do {
//            System.out.println("do...while");
//        }while(true);



    }
}
