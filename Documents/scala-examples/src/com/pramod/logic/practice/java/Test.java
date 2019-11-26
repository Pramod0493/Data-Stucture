package com.pramod.logic.practice.java;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

           int n=100;
           String number=String.format("%05d",n);
           System.out.println(number);

           String s="pramod";
           int n1=15;
           String s1="ram";
        String number1=String.format("%05d",n1);


        System.out.printf("%-20s %s\n", s,number);
        System.out.printf("%-20s %s\n", s1,number1);

    }
}