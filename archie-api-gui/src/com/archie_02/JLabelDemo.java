package com.archie_02;

import javax.swing.*;

public class JLabelDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("百度一下,你就知道");
//        设置窗体大小
        jf.setSize(400,300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

        JLabel jLabel = new JLabel("好好学习");
        jLabel.setBounds(0,0,100,20);
        ImageIcon imageIcon = new ImageIcon();
        JLabel jLabel2 = new JLabel(imageIcon);
        jLabel2.setBounds(50,50,100,143);
        jf.add(jLabel2);


        jf.add(jLabel);


        //        设置窗体可见
        jf.setVisible(true);
    }
}
