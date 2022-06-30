package com.archie_06;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerDemo {
    public static void main(String[] args) {
        JFrame jf =  new JFrame();

        jf.setTitle("事件监听机制");
        jf.setSize(400,300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

//        创建按钮
        JButton jButton = new JButton("点击");
        jButton.setBounds(0,0,100,100);
        jf.add(jButton);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("你点我啊!");
            }
        });
        jf.setVisible(true);
    }
}
