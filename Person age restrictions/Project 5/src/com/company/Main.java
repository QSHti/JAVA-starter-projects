package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;

        System.out.println("Hey, what's your name?");
        name = scanner.next();
        System.out.println("Ok," + name + ", how old are you? ");
        age = scanner.nextInt();
        if ( age < 16 ) {
            System.out.println("You can't drive, " + name);
        }else if ( age < 18 ) {
            System.out.println("You can't vote, " + name);
        }else if ( age < 25 ) {
            System.out.println("You can't rent a car, " + name);
        }else if ( age > 25){
            System.out.println("You can do anything that's legal, " + name);
        }
    }
}
