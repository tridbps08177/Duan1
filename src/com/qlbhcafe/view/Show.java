/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbhcafe.view;

import com.qlbhcafe.view.form.login.FormLogin;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JFrame;

/**
 *
 * @author baotri1998
 */
public class Show {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setTitle("ABC");
        jFrame.setSize(800, 800);
        jFrame.add(new FormLogin());
        jFrame.setVisible(true);
    }
}
