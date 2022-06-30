package com.archie_02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 用户登录
public class UserLogin {
    public static void main(String[] args) {
//        创建窗体对象
        JFrame jf = new JFrame();
        jf.setTitle("用户登录");
        jf.setSize(400,300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

//        显示用户名文本
        JLabel usernameLabel = new JLabel("用户名");
        usernameLabel.setBounds(50,50,50,20);
        jf.add(usernameLabel);

//        用户名输入框
        JTextField usernameField = new JTextField();
        usernameField.setBounds(150,50,180,20);
        jf.add(usernameField);

//      显示密码文本
        JLabel passwordLabel = new JLabel("密码");
        passwordLabel.setBounds(50,100,50,20);
        jf.add(passwordLabel);

//        JPasswordField passwordLabel = new JPasswordField("密码");
//        passwordLabel.setBounds(50,100,50,20);
//        jf.add(passwordLabel);

//        密码输入框
//        JTextField passwordField = new JTextField();
//        passwordField.setBounds(150,100,180,20);
//        jf.add(passwordField);
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150,100,180,20);
        jf.add(passwordField);


//        登录按钮
        JButton loginButton = new JButton("登录");
        loginButton.setBounds(50,200,280,20);
        jf.add(loginButton);

//        已知的用户名和密码
        String name = "archiecheng";
        String password = "123456";

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                获取用户输入的用户名和密码
                String username = usernameField.getText();
                String password = passwordField.getText();
                //                先判断输入的用户名和密码是否符合要求
                if (username.length() < 6 || username.length() > 12) {
//                    System.out.println("用户名的长度在6~12位,请重新输入");

//                    静态的成员方法和变量时可以通过类名直接访问的
                    JOptionPane.showMessageDialog(jf,"用户名的长度在6~12位,请重新输入");
                    usernameField.setText("");
                    return;
                }

                if (username.equals(name) && password.equals(password)) {
//                    System.out.println("登录成功");
                    JOptionPane.showMessageDialog(jf,"登录成功");
                } else {
//                    System.out.println("用户名或者密码错误");
                    JOptionPane.showMessageDialog(jf,"用户名或者密码错误");
                }

            }
        });


        jf.setVisible(true);
    }
}

