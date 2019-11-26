package com.pramod.logic.practice.java;

public class PallindromNumber {

    public static void main(String[] args) {
        int n=12321;
        int temp=n;
        int sum=0,rem=0;
        while(temp>0){
            rem=temp%10;
            sum=sum*10+rem;
            temp=temp/10;
        }
        if(sum==n){
            System.out.println("It is Pallindrom numner");
        }
        else{
            System.out.println("It is not a Pallindrom numner");
        }
    }
}
