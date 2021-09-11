/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Drew Butler
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //prompts the user to input a string
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is the input string?");

        //prints user's input and how many characters are in the string
        String inpuString = myObj.nextLine();
        System.out.println(inpuString + " has " +inpuString.length() + " characters.");

        myObj.close();
    }
}