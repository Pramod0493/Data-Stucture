package com.pramod.logic.practice.java;

import java.util.Scanner;

public class PallendromNumber1 {

    private  int findPallendromNumber(int number) {
        int sum=0;
        int rem=0;
        while(number!=0){
            rem=number%10;
            sum=rem+sum*10;
            number=number/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        PallendromNumber1 pallendromNumber = new PallendromNumber1();
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int calcNum=pallendromNumber.findPallendromNumber(number);
        if(calcNum==number){
            System.out.println("It is a Pallendrom Number");
        }
        else{
            System.out.println("No it is not a Pallendrom number");
        }

    }
}

