package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variables and create scanner
        int age;
        String result;
        Scanner sc = new Scanner(System.in);

        //prompt user and scan inputs
        System.out.println("What is your age?");
        age = sc.nextInt();

        //ternary operation and print result
        result = (age >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";

        System.out.println(result);

        //close scanner
        sc.close();
    }
}
