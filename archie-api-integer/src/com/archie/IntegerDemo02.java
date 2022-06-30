package com.archie;

/*
*
*   int 和 String 互相转换
*
*
* */
public class IntegerDemo02 {
    public static void main(String[] args) {
//        int --- String
        int number = 100;
//        方式1
        String s1 = number + "";
        System.out.println(s1 instanceof  String);

//        方式2
//        static String valueOf(int i)
        String s2 = String.valueOf(number);
        System.out.println(s2 instanceof String);
        System.out.println("-------------------------");

//        String --- int
        String s = "100";
//        方式1: String --- Integer --- int
        Integer i = Integer.valueOf(s);
//        int intValue() 返回值 Integer int
        int x = i.intValue();
        System.out.println(x);
//        方式2:
//        static int parseInt(String s)
        int y = Integer.parseInt(s);
        System.out.println(y);

    }
}
