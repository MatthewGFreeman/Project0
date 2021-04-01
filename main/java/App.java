package main.java;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // int damageDealt = rand.nextInt(attackDamage);
        Scanner sc = new Scanner(System.in);
        Random randomNumber = new Random();

        String[] furniture = {"Chest", "Bookcase"};
        String[] collectibles = {"Gem", "Ring", "Necklace"};
        ArrayList<String> bag = new ArrayList<>();
        int findItemChance = 66;
        int gemDropChance = 33;
        int ringDropChance = 50;
        int necklaceropChance = 50;
        //New tag line needed
        System.out.println("Welcome to the Castle!");
        boolean searching = true;
        // GAME:
        while(searching) {
            while(bag.size() < 3){
                System.out.println("----------------------------------------");
    
                //enemy info not needed, change to items?
                String searchableItem = furniture[randomNumber.nextInt(furniture.length)];
                System.out.println("\t# You find a " + searchableItem + "! \n");
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Search " + searchableItem + ".");
                System.out.println("\t2. Leave it alone and keep looking");
                System.out.println("\t3. Leave the castle");
                String input = sc.nextLine();
                if(input.equals("1")) {
                    if(randomNumber.nextInt(100) < findItemChance) {
                        System.out.println("You found an item!");
                        System.out.println("\tWhat would you like to do?");
                        System.out.println("\t1. Put the item in my bag.");
                        System.out.println("\t2. Leave it where it is.");
                        String choice = sc.nextLine();
                        if(choice.equals("1")) {
                            System.out.println("You put the item in your bag!");
                        } else {
                            System.out.println("You leave the item alone.");
                            continue;
                        }
                    } else {
                        System.out.println("The " + searchableItem + " was empty!");
                        continue;
                    }
                } else if(input.equals("2")){
                    continue;
                } else if(input.equals("3")) {
                    break;
                } else {
                    System.out.println("Invlaid command!");
                }
            }
            System.out.println("##########################");
            System.out.println("    THANKS FOR PLAYING    ");
            System.out.println("##########################");
            searching = false;
            
            sc.close();
        }

    }

}