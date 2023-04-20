package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;

        int agefromnow;
        int agebeforenow;

        System.out.println("Hello.  What is your name?");
        name = keyboard.next();
        System.out.println("Hi, " + name +"! How old are you?");
        age = keyboard.nextInt();

        agefromnow = age + 5;
        agebeforenow = age - 5;
        System.out.println("Did you know that in five years you will be " + agefromnow + " years old?");
        System.out.println("And five years ago you were " + agebeforenow + " ! Imagine that!");

    }
}
