package com.archie_01;

public class StringDemo01 {
    public static void main(String[] args) {
//        String(): 初始化新创建的 String 对象, 使其表示空字符串
        String s1 = new String();
        System.out.println(s1);
//        int length() 返回此字符串的长度
        System.out.println(s1.length());

//        String(original)
        String s2 = new String("archie");
        System.out.println(s2);
        System.out.println(s2.length());


        String s3 = "archie";
        System.out.println(s3);
        System.out.println(s3.length());
    }
}
