package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String name;
        int task1;
        int task2;
        int midterm;
        int exam;

        System.out.println("Please input your name ==> ");
        name = keyboard.next();
        System.out.println( name + " Input your results for home task 1");
        task1 = keyboard.nextInt();
        if ( task1 > 10 ) {
            System.out.println("Please input correct result");
            task1 = keyboard.nextInt();
        }

        System.out.println(name + " Input your results for home task 2");
        task2 = keyboard.nextInt();
        if (task2 > 10){
            System.out.println("Please input correct result");
            task2 = keyboard.nextInt();
        }
        System.out.println( name + " Input your results for midterm test");
        midterm = keyboard.nextInt();
        if (midterm > 30){
            System.out.println("Please input correct result");
            task2 = keyboard.nextInt();
        }
        System.out.println( name + " Input your result for examination");
        exam = keyboard.nextInt();
        if (exam > 50){
            System.out.println("Please input correct result");
            exam = keyboard.nextInt();
        }
        int summary = task1 + task2 + midterm + exam;
        System.out.println(name + ", you have " + summary);




    }
}
