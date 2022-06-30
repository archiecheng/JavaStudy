package com.archie;

public class IfTest01 {
    public static void main(String[] args) {
//        1. 定义一个 int 类型的变量用来表示信号灯的状态(1 表示红灯 2 表示绿灯 3 表示黄灯)
        int light = 1;
        light = 2;
        light = 3;
        light = 4;
//        2. 用 if 语句格式3进行多种情况的判断
        if (light == 1) {
            System.out.println("红灯停");
        } else if (light == 2) {
            System.out.println("绿灯行");
        } else if (light == 3) {
            System.out.println("黄灯亮了请等一等");
        } else {
            System.out.println("交通信号灯故障, 请在保证安全的情况下通行");
        }

//        3. 根据不同的情况给出不同的提示信息
    }
}
