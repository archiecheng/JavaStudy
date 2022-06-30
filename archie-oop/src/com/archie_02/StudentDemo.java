package com.archie_02;

// 这是我们的学生类
public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();

//        给成员变量赋值
        s.name = "林青霞";
        s.age = 30;

        System.out.println(s.name + "," + s.age);
//        调用成员方法
        s.study();
        s.doHomework();
    }
}
