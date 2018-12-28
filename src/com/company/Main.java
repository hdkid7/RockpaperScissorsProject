package com.company;

import java.util.Random;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import static java.lang.Float.MAX_VALUE;

public class Main {
    //Final constants below   0 = Rock, 1 = paper, 2 = scissors
    public static final int rock = 0;
    public static final int paper = 1;
    public static final int scissors = 2;

    //creates JFrame



    public static void main(String[] args) {
    Display display = new Display("Rock Paper Scissors! ",500,300);
    display.createJFrame();
    }

// Code below is from old version

// Scanner
//        Scanner UserInput = new Scanner(System.in);
//
//
//        int UserChoice, ComputerChoice;
//
//        // Showing prompt
//        System.out.println("Welcome to the rock paper scissors game. Choose a value" +
//                " 0 = Rock, 1 = Paper, 2 = Scissors");
//        UserChoice = UserInput.nextInt();
//
//        if (UserChoice < 0 || UserChoice > 2) {
//            System.out.println("Invalid Option. Exiting program");
//            System.exit(0);
//        }
//
//
//        // Tie
//        if (UserChoice == ComputerChoice) {
//            if (UserChoice == 0){
//                System.out.println("Tie! Both players choose Rock");
//            } else if (UserChoice == 1) {
//                System.out.println("Tie! Both players choose Paper");
//            } else if (UserChoice == 2) {
//                System.out.println("Tie! Both players choose Scissors");
//            }
//        }
//
//        // If player chooses Rock
//
//        if (UserChoice == 0){
//            if (ComputerChoice == 1 ) {
//                System.out.println("You Lose! Computer choose paper. Paper beats rock!");
//            } else if (ComputerChoice == 2) {
//                System.out.println("You Win! Computer choose scissors. Rock beats scissors");
//            }
//        }
//        //If player chooses paper
//        if (UserChoice == 1) {
//            if (ComputerChoice == 0){
//                System.out.println("You win! Computer choose rock. Paper beats rock");
//            } else if (ComputerChoice == 2)
//                System.out.println("You lose. Computer choose scissors. Scissors beats paper!");
//        }
//        // If player chooses scissors
//        if (UserChoice == 2) {
//            if (ComputerChoice == 0) {
//                System.out.println("You lose! Computer choose rock. Rock beats scissors");
//            } else if (ComputerChoice == 1) {
//                System.out.println("You win! Computer choose paper. Scissors beats paper");
//            }
//
//        }
//
//    }


}
