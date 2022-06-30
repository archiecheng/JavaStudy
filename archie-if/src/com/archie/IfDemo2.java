package com.archie;

public class IfDemo2 {
    public static void main(String[] args) {
//        定义一个变量用来表示绿灯的状态
        boolean isGreen = true;
        isGreen = false;
        if (isGreen) {
            System.out.println("绿灯行");
        } else {
            System.out.println("不是绿灯, 不允许通行");
        }
    }
}
