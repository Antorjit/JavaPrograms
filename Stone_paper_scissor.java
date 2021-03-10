package com.antorjit;

import java.util.Random;
import java.util.Scanner;

public class Stone_paper_scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int Upperbound = 4;

        //Rules
        System.out.println("Rules:    ");
        System.out.println(" ");


        System.out.println("These are some of the codes you have to use for playing this game");
        System.out.println(" ");

        System.out.println("1 ------> Stone");
        System.out.println("2 ------> Paper");
        System.out.println("3 ------> Scissor");

        System.out.println("The match will be hosted 5 times and who have the highest score wins");
        //Scores
        int playersc = 0; //Score of the player
        int compsc = 0;  //Score of computer

        System.out.println("Choose number of times you want to play: ");
        int no = sc.nextInt();


           for(int x = 1; x <= no; x=x++) {       //loop for running the game
               System.out.println("Turn " + x++);
               int compdis = rn.nextInt(Upperbound);
               System.out.println("Choose your move: ");
               int playerdis = sc.nextInt();



               if (compdis == 1) {
                   System.out.println("Computer has chosen STONE");
                   if (playerdis == 1) {
                       System.out.println("You have chosen STONE");
                       System.out.println("its a tie");
                   }
                   else if (playerdis == 2) {
                       System.out.println("You have chosen PAPER");
                       System.out.println("you win");
                       playersc = playersc + 1;
                       compsc = compsc -1;
                   }
                   else {
                       System.out.println("You have chosen SCISSOR");
                       System.out.println("you loose");
                       playersc = playersc - 1;
                       compsc = compsc + 1;
                   }

               }
               else if (compdis == 2) {
                   System.out.println("Computer has chosen PAPER");
                   if (playerdis == 1) {
                       System.out.println("You have chosen STONE");
                       System.out.println("you loose");
                       playersc = playersc - 1;
                       compsc = compsc +1;
                   }
                   else if (playerdis== 2) {
                       System.out.println("You have chosen PAPER");
                       System.out.println("its a tie");
                   }
                   else {
                       System.out.println("You have chosen SCISSOR");
                       System.out.println("you win");
                       playersc = playersc + 1;
                       compsc = compsc - 1;
                   }
               }
               else {
                   System.out.println("Computer has chosen SCISSOR");
                   if (playerdis == 1) {
                       System.out.println("You have chosen STONE");
                       System.out.println("You win");
                       playersc = playersc +1;
                       compsc = compsc - 1;
                   }
                   else if (playerdis == 2) {
                       System.out.println("You have chosen PAPER");
                       System.out.println("You loose");
                       playersc = playersc - 1;
                       compdis = compsc + 1;
                   }
                   else {
                       System.out.println("You have chosen SCISSOR");
                       System.out.println("Its a tie");
                   }
               }
           }

           if (playersc > compsc) {
               System.out.println(" ");

               System.out.println("You win against computer");
           }
           else {
               System.out.println(" ");

               System.out.println("You lost against computer");
           }
        System.out.println(" ");
        System.out.println("Your score is: " + playersc);
        System.out.println("computer's score is: " + compsc);
    }
}
