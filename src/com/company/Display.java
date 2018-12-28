package com.company;

import java.util.Random;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import static com.company.Main.*;
import static java.lang.Float.MAX_VALUE;


public class Display {

    private JFrame frame;
    private String title;
    private int width, height;
    private int height2;

    public Display(String title, int width, int height) {

        this.title = title;
        this.width = width;
        this.height = height;
        createJFrame();
    }


    JButton ROCK, PAPERR, SCISSORS;

    JLabel computerWins, humanWins;
    JTextArea area;

    Random random;










    public void createJFrame() {







        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        GridLayout layout = new GridLayout(1,3);
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());

        area = new JTextArea();
        area.setEditable(false);
        area.setFont(new Font("Consolas", Font.PLAIN,12));
        area.setText("Helllo WORLD");

        panel1.add(new JScrollPane(area),BorderLayout.CENTER);
        frame.add(panel1, BorderLayout.CENTER);

        JPanel panel2 = new JPanel();
        panel2.setLayout(layout); //sets grid layout
        frame.add(panel2, BorderLayout.SOUTH);

        JPanel panel3 = new JPanel();
        panel3.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        GridLayout layout2 = new GridLayout(1,4);
        panel3.setLayout(layout2);

        computerWins = new JLabel("0");
        computerWins.setBorder(BorderFactory.createLoweredBevelBorder());
        humanWins = new JLabel("0");
        humanWins.setBorder(BorderFactory.createLoweredBevelBorder());

        panel3.add(new JLabel("Computer: "));
        panel3.add(computerWins);
        panel3.add(new JLabel("Human: "));
        panel3.add(humanWins);
        frame.add(panel3,BorderLayout.NORTH);

        ROCK = new JButton("Rock");




    }

    // Return 0 if computer wins
    // return 1 if human wins
    // return 2 if tie


        //creates JFrame
        public int gameLogic (int computer, int human ) {
            if (computer == human) {
                return 2;
            } else if (computer == rock && human == scissors) {
                return 0; // Computer wins
            } else if (human == rock && computer == scissors){
                return 1; //human wins
            } else if (computer == paper && human == scissors ){
                return 1; //human wins
            }else if (computer == scissors && human == paper){
                return 0; //computer wins
            }else if (computer == paper && human == rock){
                return 0;
            }else if (computer == rock && human == paper){
                return 1;
            } return -1;






    }

    public String converttoText(int x){
        switch (x){
            case rock:
                return "Rock";
            case paper:
                return "Paper";
            case scissors:
                return "Scissors";
            default:
                return "Invalid selection! ";
        }
    }
    public void randomTurn(int human){
        int comp = random.nextInt(3); // chooses number from 0 - 2

    }
}


