package com.company;

import java.util.Random;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import static java.lang.Float.MAX_VALUE;


public class Display {

    private JFrame frame;
    private String title;
    private int width, height;

    public Display(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
        createJFrame();
    }

//    JButton  rockButton, paperButton, scissorsButton; Button used to trigger will be used later on!
//
//    JLabel computerWins, humanWins;
//    JTextArea area;
//
//    Random random;
//
//}

    private void createJFrame() {
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}

