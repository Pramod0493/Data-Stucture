package com.pramod.logic.practice.java;

public class TernariOperator {
    public static void main(String[] args) {
        int number=7;
        String str=(number % 2==0)?"even":"odd";

        String output=(number%2==0)?"even number":"odd number";
        System.out.println(output);
    }
}

//0 1 1 2 3 5 8 13 21