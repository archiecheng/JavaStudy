package com.archie_01;
/*
*   数组访问方式
*       格式: 数组名
*
*   数组内部保存的数据的访问方式
*
*       格式: 数组名[索引]
*
* */
public class ArrayDemo {
    public static void main(String[] args) {
//        定义一个数组并进行初始化
//        int[] scores = new int[] {93,96,99};
        int[] scores = {93,96,99};

//        输出数组名
        System.out.println(scores);

//        输出数组中的元素
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println("----------------");

//        修改数组中的元素
        scores[0] = 100;
        scores[1] = 98;
        scores[2] = 95;
//        再次输出数组中的元素
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
    }
}
