package com.archie;

//
public class ForTest06 {
    public static void main(String[] args) {
        for (int i = 10000; i < 100000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int qian = i / 1000 % 10;
            int wan = i / 10000 % 10;
            if ((ge == wan) && (shi == qian)) {
                System.out.println(i);
            }
        }
    }
}
