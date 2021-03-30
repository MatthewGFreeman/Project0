package main.java;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        Scanner sc = new Scanner(System.in);
        boolean playing = true;
        //Add basic logic to play game here
        while(playing){
            System.out.println("Would you like to continue playing?");
            System.out.println("1: yes");
            System.out.println("2: no");
            int choice = sc.nextInt();
            System.out.println(choice);
            if(choice == 1){
                System.out.println("You are playing the game");
                System.out.println("Would you like to continue playing?");
                System.out.println("1: yes");
                System.out.println("2: no");
                choice = sc.nextInt();
            } else {
                System.out.println("You quit the game");
                playing = false;
                sc.close();
            }
        }
    }
}