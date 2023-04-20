package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 0;
        int b = 100000;

        int userPaidMoney = 0;
        int userTry = 0;
        int index = 0;
        int random_number = a + (int) (Math.random() * b);
        String hint = String.valueOf(random_number);
        boolean Flag = true;

        while(Flag){
            System.out.println("Press p to play and pay $1.00");
            System.out.println("Press h and pay $2.00 to take a hint!");
            System.out.println("Press q for quit");
            String userChoice = s.next();
            if(userChoice.charAt(0) == 'p'){
                System.out.println("Guess the number from 0 to 100000");
                userTry = s.nextInt();
                userPaidMoney += 1;
                if (userTry == random_number){
                    System.out.println("You won 1.000.000$!");
                    Flag = false;
                }
                else{
                    System.out.println("You lost: " + userPaidMoney + "$");
                }
            }else if(userChoice.charAt(0) == 'h'){
                userPaidMoney += 2;
                if(index <= hint.length()){
                    System.out.println(hint.charAt(index));
                    index++;
                }
            }else if(userChoice.charAt(0) == 'q'){
                Flag = false;

            }
        }
    }
}
