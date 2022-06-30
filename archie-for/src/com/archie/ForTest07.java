package com.archie;
// 逢七过
public class ForTest07 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            if ((ge == 7) || (shi == 7) || (i % 7 == 0)) {
                System.out.println(i);
            }
        }
    }
}
