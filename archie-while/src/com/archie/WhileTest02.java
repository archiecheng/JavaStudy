package com.archie;

public class WhileTest02 {
    public static void main(String[] args) {
        int count = 0;
        double paper = 0.001;
        double zf = 8848.86;

        while(paper < zf) {
            paper *= 2;
            count ++;
        }
        System.out.println(count);
    }
}
