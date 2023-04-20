package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int StudentsAge[] = new int [10];
        System.out.println("Enter students age one by one");
        for(int i=0; i<10; i++){
            StudentsAge[i] = scanner.nextInt();
        }
        int avg = 0;
        int sum = 0;
        for(int j = 0; j<10; j++){
            sum += StudentsAge[j];
        }
        avg = sum/10;

    }
}
