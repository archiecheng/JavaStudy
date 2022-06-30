package com.archie;

// 求 1 ~ 100 奇数和
public class WhileTest01 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while(i <= 100) {
            sum += i;
            i +=2;
        }
        System.out.println(sum);
    }
}
