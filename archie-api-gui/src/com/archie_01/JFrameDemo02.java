package com.archie_01;

import javax.swing.*;

public class JFrameDemo02 {
    public static void main(String[] args) {
//        创建窗体对象
        JFrame jf = new JFrame();
        jf.setTitle("百度一下,你就知道");
//        设置窗体大小
        jf.setSize(400,300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
//        设置窗体可见
        jf.setVisible(true);
    }
}
