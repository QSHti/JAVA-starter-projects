package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String question1 = " Q1) What is the capital of Alaska?";
        String Q1answer1 = " 1) Melbourne";
        String Q1answer2 = " 2) Anchorage";
        String Q1answer3 = " 3) Juneau";

        String question2 = " Q2) Can you store the value \"cat\" in a variable of type int?";
        String Q2answer1 = " 1) yes";
        String Q2answer2 = " 2) no";
        String question3 = " Q3) What is the result of 9+6/3?";
        String Q3answer1 =" 1) 5";
        String Q3answer2 =" 2) 11";
        String Q3answer3 =" 3) 15/3";

        int UserAnswer;

        System.out.println(question1);
        System.out.println(Q1answer1);
        System.out.println(Q1answer2);
        System.out.println(Q1answer3);
        System.out.println("Type answer here ==>");
        UserAnswer = keyboard.nextInt();
        if(UserAnswer != 1 && UserAnswer != 2 && UserAnswer != 3){
            System.out.println("Please,select answer variance from 1 to 3");
        }else if(UserAnswer == 3){
            System.out.println("Correct!");
        }else{
            System.out.println("Wrong");
        }

        System.out.println(question2);
        System.out.println(Q2answer1);
        System.out.println(Q2answer2);
        System.out.println("Type answer here ==>");
        UserAnswer = keyboard.nextInt();
        if(UserAnswer != 1 && UserAnswer != 2){
            System.out.println("Please,select answer variance from 1 to 2");
        }else if(UserAnswer == 2){
            System.out.println("Correct!");
        }else{
            System.out.println("Wrong");
        }

        System.out.println(question3);
        System.out.println(Q3answer1);
        System.out.println(Q3answer2);
        System.out.println(Q3answer3);
        System.out.println("Type answer here ==>");
        UserAnswer = keyboard.nextInt();
        if(UserAnswer != 1 && UserAnswer != 2 && UserAnswer != 3){
            System.out.println("Please,select answer variance from 1 to 3");
        }else if(UserAnswer == 2){
            System.out.println("Correct!");
        }else{
            System.out.println("Wrong");
        }
    }
}
