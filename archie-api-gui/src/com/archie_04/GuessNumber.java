package com.archie_04;

import javax.swing.*;
// 猜数字
public class GuessNumber {
    public static void main(String[] args) {
//        创建窗体对象
        JFrame jf = new JFrame();
        jf.setTitle("猜数字");
        jf.setSize(400,300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

        JLabel messageLabel = new JLabel("系统产生了一个1-100之间的数据,请猜一猜");
        messageLabel.setBounds(70,50,350,20);
        jf.add(messageLabel);

//        输入要猜的数字
        JTextField numberFiled = new JTextField();
        numberFiled.setBounds(120,100,150,20);
        jf.add(numberFiled);

//        猜数字的按钮
        JButton guessButton = new JButton("我猜");
        guessButton .setBounds(150,150,100,20);
        jf.add(guessButton);


        jf.setVisible(true);
    }
}
