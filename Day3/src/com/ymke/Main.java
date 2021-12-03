package com.ymke;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String oxy = "";
        String co2 = "";
        List<String> data = new ArrayList<String>();
        try {
            File myObj = new File("input/input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data.add(myReader.nextLine());
            }
            myReader.close();

            //Oxygen
            List<String> oxyList = data;
            for (int i = 0; i < 12; i++) {
                List<String> selection = new ArrayList<String>();
                int amountOf0 = 0;
                int amountOf1 = 0;
                for (String value : oxyList) {
                    char bit = value.charAt(i);
                    int n = Character.getNumericValue(bit);
                    if(n == 0) {
                        amountOf0++;
                    } else {
                        amountOf1++;
                    }
                }
                if(amountOf0 == amountOf1 || amountOf1 > amountOf0) {
                    for (String value: oxyList) {
                        char bit = value.charAt(i);
                        int n = Character.getNumericValue(bit);
                        if(n == 1) { selection.add(value);}
                    }
                } else if(amountOf0 > amountOf1) {
                    for (String value: oxyList) {
                        char bit = value.charAt(i);
                        int n = Character.getNumericValue(bit);
                        if(n == 0) { selection.add(value);}
                    }
                }
                oxyList = selection;
                if(oxyList.size() == 1) {
                    oxy = oxyList.get(0);
                    break;
                }
            }

            //co2
            List<String> co2List = data;
            for (int i = 0; i < 12; i++) {
                List<String> selection = new ArrayList<String>();
                int amountOf0 = 0;
                int amountOf1 = 0;
                for (String value : co2List) {
                    char bit = value.charAt(i);
                    int n = Character.getNumericValue(bit);
                    if(n == 0) {
                        amountOf0++;
                    } else {
                        amountOf1++;
                    }
                }
                if(amountOf0 == amountOf1 || amountOf1 > amountOf0) {
                    for (String value: co2List) {
                        char bit = value.charAt(i);
                        int n = Character.getNumericValue(bit);
                        if(n == 0) { selection.add(value);}
                    }
                } else if(amountOf0 > amountOf1) {
                    for (String value: co2List) {
                        char bit = value.charAt(i);
                        int n = Character.getNumericValue(bit);
                        if(n == 1) { selection.add(value);}
                    }
                }
                co2List = selection;
                if(co2List.size() == 1) {
                    co2 = co2List.get(0);
                    break;
                }
            }
            int gam = Integer.parseInt(oxy, 2);
            int eps = Integer.parseInt(co2, 2);
            System.out.println("Oxygen: " + oxy + " converted: " + gam);
            System.out.println("CO2: " + co2 + " converted: " + eps);
            System.out.println("Final: " + gam * eps );
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //Part 1:
    /*
    String gamma = "";
        String epsilon = "";
        List<String> data = new ArrayList<String>();
        try {
            File myObj = new File("input/input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data.add(myReader.nextLine());
            }
            myReader.close();
            for (int i = 0; i < 12; i++) {
                int amountOf0 = 0;
                int amountOf1 = 0;
                for (String value : data) {
                    char bit = value.charAt(i);
                    int n = Character.getNumericValue(bit);
                    if(n == 0) {
                        amountOf0++;
                    } else {
                        amountOf1++;
                    }
                }
                if(amountOf0 > amountOf1) {
                    gamma = gamma + "1";
                    epsilon = epsilon + "0";
                } else {
                    gamma = gamma + "0";
                    epsilon = epsilon + "1";
                }
            }
            int gam = Integer.parseInt(gamma, 2);
            int eps = Integer.parseInt(epsilon, 2);
            System.out.println("gamma: " + gamma + " converted: " + gam);
            System.out.println("epsilon: " + epsilon + " converted: " + eps);
            System.out.println("Final: " + gam * eps );
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
     */
}
