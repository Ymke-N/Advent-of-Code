package com.ymke;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int horizontal = 0;
        int depth = 0;
        int aim = 0;
        try {
            File myObj = new File("input/input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String[] data = myReader.nextLine().split(" ");
                if(data[0].equals("forward")) {
                    int amount = Integer.parseInt(data[1]);
                    horizontal = horizontal + amount;
                    depth = depth + (aim * amount);
                    System.out.println("Forward " + amount);
                } else if(data[0].equals("down")) {
                    int amount = Integer.parseInt(data[1]);
                    aim = aim + amount;
                    System.out.println("Down " + amount + " (aim) " + aim);
                } else if(data[0].equals("up")) {
                    int amount = Integer.parseInt(data[1]);
                    aim = aim - amount;
                    System.out.println("Up " + amount + " (aim) " + aim);
                }
            }
            System.out.println("Final: depth - " + depth + " horizontal - " + horizontal + " together: " + horizontal * depth);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /*
    Part 1:

    int horizontal = 0;
        int depth = 0;
        try {
            File myObj = new File("input/input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String[] data = myReader.nextLine().split(" ");
                if(data[0].equals("forward")) {
                    int amount = Integer.parseInt(data[1]);
                    horizontal = horizontal + amount;
                    System.out.println("Forward " + amount);
                } else if(data[0].equals("down")) {
                    int amount = Integer.parseInt(data[1]);
                    depth = depth + amount;
                    System.out.println("Down " + amount);
                } else if(data[0].equals("up")) {
                    int amount = Integer.parseInt(data[1]);
                    depth = depth - amount;
                    System.out.println("Up " + amount);
                }
            }
            System.out.println("Final: depth - " + depth + " horizontal - " + horizontal + " together: " + horizontal * depth);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
     */
}
