package com.archie_03;

public class StudentDemo {
    public static void main(String[] args) {
//        创建对象
        Student s = new Student();
//        给成员变量赋值
//        s.name = "林青霞";
        s.setName("林青霞");
//        s.age = 30;
//        s.age = -30;
        s.setAge(30);
//        s.setAge(-30);
//        调用 show
        s.show();
//        System.out.println(s.name + "," + s.age);
        System.out.println(s.getName()+", "+s.getAge());
    }
}
