package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String StudentName;
        System.out.println("Hello, please write your name: ");
        StudentName = s.nextLine();
        int task1;
        int task2;
        int midterm;
        int exam;

        System.out.println("Input results for Home Task 1");
        task1 = s.nextInt();
        if (task1 > 10) {
            System.out.println("Please input correct result");
            task1 = s.nextInt();
        }
            System.out.println("Input results for Home Task 2");
            task2 = s.nextInt();
            if (task2 > 10) {
                System.out.println("Please input correct result");
                task2 = s.nextInt();
            }
                System.out.println("Input results for Midterm test");
                midterm = s.nextInt();
                if (midterm > 30) {
                    System.out.println("Please input correct result");
                    midterm = s.nextInt();
                }
                System.out.println("Input results for Final exam");
                exam = s.nextInt();
                if (exam > 50) {
                        System.out.println("Please input correct result");
                        exam = s.nextInt();
                }
                 int summary = task1 + task2 + midterm + exam;
                 System.out.println("You have " + summary + " total marks, results are saved to file with your name." );

                try {
                    FileWriter fw = new FileWriter(StudentName + "_JavaResults.txt");
                    PrintWriter pw = new PrintWriter(fw);
                   pw.println(" Results of Home Task 1:  "  + task1);
                    pw.println(" Results of Home Task 2:  " + task2);
                    pw.println (" Results of Midterm test:  " + midterm);
                    pw.println (" Results of Final Exam:  " + exam);
                    pw.println (" Summary : " + summary);
                    pw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
     }
    }