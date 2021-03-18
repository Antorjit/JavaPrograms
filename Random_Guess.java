package com.antorjit;

import java.util.Random;
import java.util.Scanner;

public class Random_Guess {
    public static void main(String[] args) {
        // RULES
        System.out.println("Hi user, Its me java. today we are going to play a game. Let me explain it to you.");
        System.out.println("You will select a number between 1 to 5 ");
        System.out.println("The computer will either randomly add or subtract a number from it");
        System.out.println("computer will repeat this process based on the difficulty");
        System.out.println("If it is either 0 or less than 0 you will loose");
        // ASSIGNMENTS
        int upperbound = 2;
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        int n, no, turn;
        turn = 0;
        no = 1;
        // DIFFICULTY CONFIGURATION
        System.out.println("Enter Difficulty level: H/ M/ E");
        String diff = sc.next(); // INPUT FROM USER
        switch (diff) {
            case "H":
                System.out.println("Difficulty is set to Hard");
                n = 5;
                break;
            case "M":
                System.out.println("difficulty set to Medium");
                n = 10;
                break;
            default:
                System.out.println("Difficulty is set to Easy");
                n = 15;
                break;
        }
        //LOOP FOR GAME

        System.out.println("Number is always set to 1.");
        System.out.println();
        for (int ctr = 0; (ctr != n); ctr ++) {
            System.out.println("----" + ++turn + "----");
            int a = rn.nextInt(upperbound);
            if (a == 0) {
                no = no - 1;
                System.out.println("A number got subtracted");
            }
            else {
                no = no + 1;
                System.out.println("A number got added");
            }
            System.out.println("current number is " + no);
            System.out.println();
        }
        if (no <= 0) {
            System.out.println("You lost :P");
        }
        else {
            System.out.println("You win :D");
        }
        System.out.println("Your current number is: " + no);
    }
}
