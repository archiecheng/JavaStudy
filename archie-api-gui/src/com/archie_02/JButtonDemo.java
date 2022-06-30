package com.archie_02;

import javax.swing.*;

public class JButtonDemo {
    public static void main(String[] args) {
        //        创建窗体对象
        JFrame jf = new JFrame();
        jf.setTitle("百度一下,你就知道");
//        设置窗体大小
        jf.setSize(400,300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);
        JButton btn = new JButton("我是按钮");
        btn.setSize(100,20);

//        btn.setLocation(0,0);
//        btn.setLocation(100,100);
        btn.setBounds(100,100,100,20);
        JButton btn2 = new JButton("我是按钮2");
        btn2.setBounds(100,120,100,20);
        jf.add(btn2);
        jf.add(btn);
//        设置窗体可见
        jf.setVisible(true);
    }
}
