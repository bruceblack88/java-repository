package com.galvanize;
import java.util.Scanner;


public class ChooseAdventureGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the choose your Adventure game");
        System.out.println("Who are you?");

        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("You entered " + name + ".");
        System.out.println(name + " , enter 1 to turn left or enter 2 to turn right.");
        int directions = in.nextInt();

        if (directions ==1) {
            System.out.println(name + " goes left to the snack factory.");
            System.out.println(name + " sees Red Bull and a Fig Bar.");
            System.out.println("To buy a Red Bull enter 1. For a fig bar press 2.");
            directions = in.nextInt();
            if (directions ==1){
                System.out.println(name + " buys and drinks a Red Bull.");
                System.out.println(name + " has wings.");
                return;
            } else if (directions ==2) {
                System.out.println(name + " buys and eats a fig bar.");
                System.out.println(name + " is boujee");
                return;
            }
        } else if (directions ==2) {
            System.out.println(name + " goes right to the bathroom");
            System.out.println(name + " is in the bathroom.");
            System.out.println("To wash your hands press 1 or press 2 to leave the bathroom.");
            directions = in.nextInt();
            if (directions ==1){
                System.out.println( name + " washes hands.");
                System.out.println("");
                return;
            } else if (directions ==2) {
                System.out.println(name + " leaves the bathroom.");
                return;
            }

        }


    }
}
