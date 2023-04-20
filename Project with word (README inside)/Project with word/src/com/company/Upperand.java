package com.company;

import java.util.Scanner;

public class Upperand {

    public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                System.out.print("Input a String: ");
                String line = in.nextLine();
                line = line.toLowerCase();
                System.out.println(line);
        System.out.println(line.toUpperCase());
    }
}
