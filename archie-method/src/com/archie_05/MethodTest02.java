package com.archie_05;

public class MethodTest02 {
    public static void main(String[] args) {
        boolean flag = compare(10,20);
        System.out.println(flag);

        flag = compare(10,10);
        System.out.println(flag);

    }
    public static boolean compare(int a, int b) {
//        if (a == b) {
//            return true;
//        } else {
//            return false;
//        }


//        boolean flag = (a == b) ? true : false;
//        return flag;


//        boolean flag = (a == b);
//        return flag;

        return a == b;

    }
}
