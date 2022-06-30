package com.archie_05;

import javax.swing.*;

public class AttendanceQuery01 {
    public static void main(String[] args) {
        //        创建窗体对象
        JFrame jf = new JFrame();
        jf.setTitle("猜数字");
        jf.setSize(400,300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

//        显示考勤日期的文本
        JLabel dateLabel = new JLabel("考勤日期");
        dateLabel.setBounds(50,20,100,20);
        jf.add(dateLabel);

//        显示开始时间文本
        JLabel startDateLabel = new JLabel("开始时间");
        startDateLabel.setBounds(50,70,100,20);
        jf.add(startDateLabel);


//        显示开始时间输入框
        JTextField startDateField = new JTextField();
        startDateField.setBounds(50,100,100,20);
        jf.add(startDateField);

        //   显示结束时间文本
        JLabel endDateLabel = new JLabel("结束时间");
        endDateLabel.setBounds(250,70,100,20);
        jf.add(endDateLabel);


//        显示结束时间输入框
        JTextField endDateField = new JTextField();
        endDateField.setBounds(250,100,100,20);
        jf.add(endDateField);

        JButton confirmButton = new JButton("确定");
        confirmButton.setBounds(250,180,60,20);
        jf.add(confirmButton);


        jf.setVisible(true);
    }
}
