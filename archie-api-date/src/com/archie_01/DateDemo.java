package com.archie_01;

import java.util.Date;

/*
*
* 构造方法
*   Date(): 分配 Date 对象并对其进行初始化, 使其表示分配时间, 测量 Date 到毫秒
*   Date(long date): 分配 Date 对象并初始化它以表示自标准时间以来的指定毫秒数, 即 1970年1月1日00:00:00
*
* */
public class DateDemo {
    public static void main(String[] args) {

        Date d1 = new Date();
        System.out.println(d1);

        System.out.println("------------------");

        Date d2 = new Date(1000 * 60 * 60);
        System.out.println(d2);


    }
}
