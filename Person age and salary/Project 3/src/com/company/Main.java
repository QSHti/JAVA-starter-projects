package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        Double number;

        System.out.println("Hello.  What is your name?");
        name = keyboard.next();
        System.out.println("Hi, " + name + " How old are you?");
        age = keyboard.nextInt();
        System.out.println("So you're " + age + ", eh? That's not old at all! How much do you make, " + name + "?");
        number = keyboard.nextDouble();
        System.out.println( number + "! I hope that's per hour and not per year! LOL!");

    }
}
