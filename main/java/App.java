package main.java;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        boolean playing = true;
        String playerName = getName();
        //Add basic logic to play game here
        while(playing){
            System.out.println(playerName + " would you like to continue playing?");
            System.out.println("1: yes");
            System.out.println("2: no");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println("You are playing the game");
                System.out.println("What would you like to do?");
                System.out.println("1: Check bag");
                System.out.println("2: Quit game");
                choice = sc.nextInt();
                if(choice == 2){
                    break;
                }
                
                if (choice == 1) {
                    checkBag();
                }
            } else {
                System.out.println("You quit the game");
                playing = false;
                sc.close();
            }
        }
    }

    public static String getName() {
        System.out.println("What is your name?");
        String name = sc.nextLine();

        return name;
    }

    public static void checkBag() {
        System.out.println("Checking bag");
        //Needs to iterate over a bag(array) to show items
        //If no items, needs to print no items
    }

    static Scanner sc = new Scanner(System.in);
}