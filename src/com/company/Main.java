package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static ArrayList<House> houses = new ArrayList<>();
    public static ArrayList<Pig> pigs = new ArrayList<>();
    public static HashMap<Pig, House> pigsHouses = new HashMap<>();
    public static Scanner scanner = new Scanner(System.in);
    public static int currentDay = 0;
    public static void main(String[] args) {
        // house building phase - day 1 to 7
        // while day < 8
        // if day == 0, all pigs start building
        // for each pig
        Pig pig1 = new Pig("pig1", true, 15);
        pig1.buildHouse(new Material("straw", 1), 1);
        System.out.println(pigs.get(0).getName());
        // pig2
        Pig pig2 = new Pig("pig2", true, 17);
        pig2.buildHouse(new Material("wood", 2), 3);
        System.out.println(houses.get(1).getMaterial().getType());
        //pig3
        Pig pig3 = new Pig("pig3", true, 17);
        pig3.buildHouse(new Material("bricks", 3), 7);
        System.out.println(houses.get(2).getMaterial().getType());
        Wolf wolf = new Wolf("wolf", false);
        wolf.knock(2);
        wolf.blowOnTheHouse(2);
        // loop through the pigs list
        // if the pig is at the location of blown off house, run!
        for (Pig pig : pigs) {
            if (pig.getLocation() == 2) {
                pig.runningToNextHouse();
            }
        }
    }
}

