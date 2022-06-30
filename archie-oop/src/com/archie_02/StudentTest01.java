package com.archie_02;

public class StudentTest01 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s);

        System.out.println(s.name+","+s.age);

        s.name = "张曼玉";
        s.age = 28;

        System.out.println(s.name+","+s.age);

        s.study();
        s.doHomework();
    }
}
