package main.java;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    static Random randomNumber = new Random();
    public static void main(String[] args) {
        //Make class for player, include name and bag?
        ArrayList<String> bag = new ArrayList<>();

        System.out.println("###################################################################");
        System.out.println("###############     Welcome to the Castle     #####################");
        System.out.println("###################################################################");
        System.out.println("\tYour goal is to collect three items.");
        System.out.println("\tAs you search the castle you will come across some furniture.");
        System.out.println("\tSearch these pieces to find collectible items.");
        System.out.println("\tPlace the collectibles in your bag.");
        System.out.println("\tCollect three items to win!");

        boolean searching = true;

        gamePlay(searching, bag);
    }

    public static void gamePlay(boolean playing, ArrayList<String> pack){
        while(playing) {
            //Make classes for items and bag?
            String[] furniture = {"Chest", "Bookcase"};

            while(pack.size() < 3){
                System.out.println("-------------------------------------------------------------------");
    
                String searchableItem = furniture[randomNumber.nextInt(furniture.length)];
                System.out.println("\t# You find a " + searchableItem + "! \n");
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Search " + searchableItem + ".");
                System.out.println("\t2. Leave it alone and keep looking");
                System.out.println("\t3. Leave the castle");
                String input = sc.nextLine();
                
                playerChoice(input, pack, searchableItem);
            }
            System.out.println("###################################################################");
            System.out.println("################     Thanks for playing!     ######################");
            System.out.println("###################################################################");
            playing = false;
            
            sc.close();
        }
    }

    public static void playerChoice(String choice, ArrayList<String> pack, String pieceOfFurniture){

        String[] collectibles = {"Gem", "Ring", "Necklace"};
        int findItemChance = 66;

        if(choice.equals("1")) {
            if(randomNumber.nextInt(100) < findItemChance) {
                String foundItem = collectibles[randomNumber.nextInt(collectibles.length)];
                System.out.println("\tYou found a " + foundItem + "!");
                System.out.println("\tWhat would you like to do?");
                System.out.println("\t1. Put the item in my bag.");
                System.out.println("\t2. Leave it where it is.");
                String nextChoice = sc.nextLine();

                while(!nextChoice.equals("1") && !nextChoice.equals("2")) {
                    System.out.println("Invalid command!");
                    System.out.println("\tWhat would you like to do?");
                    System.out.println("\t1. Put the item in my bag.");
                    System.out.println("\t2. Leave it where it is.");
                    choice = sc.nextLine();
                }
                if(nextChoice.equals("1")) {
                    pack.add(foundItem);
                    System.out.println("You put the " + foundItem + " in your bag!");
                    System.out.println("You now have " + pack.size() + " item(s) in your bag.");
                    System.out.println("You need " + (3 - pack.size()) + " more items to win!");
                } else {
                    System.out.println("You leave the " + foundItem + " alone.");
                    System.out.println("You have " + pack.size() + " item(s) in your bag.");
                    System.out.println("You need " + (3 - pack.size()) + " more items to win!");
                    // continue;
                }
            } else {
                System.out.println("The " + pieceOfFurniture + " was empty!");
                // continue;
            }
        } else if(choice.equals("2")){
            System.out.println("You leave the " + pieceOfFurniture + " alone and keep searching.");
            // continue;
        } else if(choice.equals("3")) {
            System.out.println("You decide to leave the castle without filling your bag.");
            pack.add(" ");
            pack.add(" ");
            pack.add(" ");
        } else {
            System.out.println("Invlaid command!");
        }
    }

}