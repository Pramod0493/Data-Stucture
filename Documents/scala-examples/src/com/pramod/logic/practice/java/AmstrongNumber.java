package com.pramod.logic.practice.java;

public class AmstrongNumber {
    public static void main(String[] args) {
        int n=153;
        int temp=n;
        int sum=0,rem=0;
        while(temp>0){
            rem=temp%10;
            sum=sum+(rem*rem*rem);
            temp=temp/10;
        }
        if(n==sum){
            System.out.println("It is amstrong numner");
        }
        else {
            System.out.println("It is not a amstrong numebr");
        }
    }
}
