/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.jpasswordexample;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

/**
 *
 * @author PC
 */
public class JPasswordExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("PasswordField Örneği");

        JLabel l1 = new JLabel("Şifre: ");
        l1.setBounds(20, 20, 100, 30);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(20, 50, 100, 30);

        JButton btn = new JButton("Gönder");
        btn.setBounds(20, 80, 100, 30);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = new String(pass.getPassword());
                l1.setText(l1.getText() + password);
            }

        });

        frame.add(l1);
        frame.add(pass);
        frame.add(btn);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
