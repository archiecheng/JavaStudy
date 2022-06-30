package com.archie_05;

import javax.swing.*;

public class ShowDateTime {
    public static void main(String[] args) {
        //        创建窗体对象
        JFrame jf = new JFrame();
        jf.setTitle("猜数字");
        jf.setSize(400,300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

//        提示日期
        JLabel dateLabel = new JLabel("日期");
        dateLabel.setBounds(50,50,100,20);
        jf.add(dateLabel);

//        按照格式显示日期的字符串
        JLabel showDateLabel = new JLabel("xxxx年xx月xx日");
        showDateLabel.setBounds(50,80,200,20);
        jf.add(showDateLabel);

//        提示时间
        JLabel timeLabel = new JLabel("时间");
        timeLabel.setBounds(50,150,100,20);
        jf.add(timeLabel);

//        按照格式显示时间的字符串
        JLabel showTimeLabel = new JLabel("xx:xx");
        showTimeLabel.setBounds(50,180,200,20);
        jf.add(showTimeLabel);


        jf.setVisible(true);
    }
}
