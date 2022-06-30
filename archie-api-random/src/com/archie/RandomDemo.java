package com.archie;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();

//        int i = r.nextInt(10);
//        System.out.println(i);


//        for (int i = 1; i <= 10; i++) {
//            int j = r.nextInt(10);
//            System.out.println(j);
//        }

//        获取 1 ~ 100 之间的随机数
        int number = r.nextInt(100) + 1;
        System.out.println(number);

    }
}
