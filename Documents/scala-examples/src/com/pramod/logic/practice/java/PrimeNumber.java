package com.pramod.logic.practice.java;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int i=1;
        int count=0;
        while(i<=n){
            if(n%i==0){
                count++;
            }
            i++;
        }
        if(count==2){
            System.out.println("It is a Prime Number");
        }
        else{
            System.out.println("It is not a Prime Number");
        }
    }
}
