package com.company;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int output_num = 0;
        for(int i = 0 ; i<10; i++){
            output_num += num;
            System.out.println(output_num);
        }
    }
}
