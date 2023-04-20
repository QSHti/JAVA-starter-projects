package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //write your code here
        {
            Scanner keyboard = new Scanner(System.in);

            int age;
            int feet;
            int inches;
            int weight;

            System.out.print("How old are you? ");
            age = keyboard.nextInt();

            System.out.print("How many feet tall are you? ");
            feet = keyboard.nextInt();

            System.out.print("And how many inches? ");
            inches = keyboard.nextInt();

            System.out.print("How much do you weigh? (in KG) ");
            weight = keyboard.nextInt();

            System.out.println("So you're " + age + " old, " +  feet + "\'" + inches + "\"" + " tall and " + weight + "kg heavy.");

        }
    }
}