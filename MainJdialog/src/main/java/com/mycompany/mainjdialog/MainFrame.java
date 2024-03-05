/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainjdialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author LENOVO
 */
public class MainFrame extends JFrame{
    private JButton checkTotalStudentButton, newStudentButton;
    public MainFrame()
    {
        setTitle("Student Management");
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel inputJPanel = new JPanel(new GridLayout(1, 2));
        JPanel button = new JPanel(new GridLayout(1, 2, 5, 5));
        checkTotalStudentButton = new JButton("Check total Student");
        newStudentButton = new JButton("New Student");
        button.add(checkTotalStudentButton);
        button.add(newStudentButton);
        mainPanel.add(button, BorderLayout.NORTH);
        add(mainPanel);
        setVisible(true);
        
        
    }
}
