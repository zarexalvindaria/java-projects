package com.example.simplegui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class SimpleGUI implements ActionListener {

    private static JLabel userLabel, passwordLabel, success;
    private static JTextField userText;
    private static JPasswordField passwordText;
    private static JButton button;

    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(320, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100,  50, 165, 25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(140, 80, 80, 25);
        button.addActionListener(new SimpleGUI());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user + ", " + password);

        if(user.equals("zarex") && password.equals("p")) {
            success.setText("Login successful!");
        }
    }

}
