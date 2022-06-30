package com.archie;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        System.out.println("系统已经随机产生了一个 1 ~ 100 之间的整数");

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要猜的数字:");
            int guessNumber = sc.nextInt();
            if (guessNumber > number) {
                System.out.println("你猜的数据大了");
            } else if(guessNumber < number){
                System.out.println("你猜的数据小了");
            } else {
                System.out.println("猜中了!");
                break;
            }
        }

    }
}
