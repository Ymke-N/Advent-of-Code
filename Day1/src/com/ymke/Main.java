package com.ymke;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int increased = 0;
        try {
            File myObj = new File("input/input.txt");
            Scanner myReader = new Scanner(myObj);
            int first = Integer.parseInt(myReader.nextLine());
            int second = Integer.parseInt(myReader.nextLine());
            int third = Integer.parseInt(myReader.nextLine());
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                int next = Integer.parseInt(data);
                if((first + second + third) < (second + third + next)) {
                    increased++;
                    System.out.println((second + third + next) + " (increased)");
                }else if ((first + second + third) == (second + third + next)) {
                    System.out.println((second + third + next) + " (No change)");
                } else {
                    System.out.println((second + third + next) + " (decreased)");
                }
                first = second;
                second = third;
                third = next;
            }
            System.out.println("Final: " + increased);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //Puzzle 1:
    /*
    int increased = 0;
        int previous = 0;
        try {
            File myObj = new File("input/input.txt");
            Scanner myReader = new Scanner(myObj);
            previous = Integer.parseInt(myReader.nextLine());
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                int current = Integer.parseInt(data);
                if(current > previous) {
                    increased++;
                    System.out.println(current + " (increased)");
                } else {
                    System.out.println(current + " (decreased)");
                }
                previous = current;
            }
            System.out.println("Final: " + increased);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
     */
}
