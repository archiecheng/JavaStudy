package com.archie;

// switch 语句
public class SwitchDemo {
    public static void main(String[] args) {
//        定义一个 int 类型的变量来表示信号灯的状态(1表示红灯, 2表示绿灯, 3表示黄灯)
        int light = 1;
        light = 2;
        light = 3;
        light = 4;
//        switch 语句实现交通信号灯案例
        switch(light) {
            case 1:
                System.out.println("红灯停");
                break;
            case 2:
                System.out.println("绿灯行");
                break;
            case 3:
                System.out.println("黄灯亮了等一等");
            default:
                System.out.println("信号灯故障");
                break;
        }
    }
}
