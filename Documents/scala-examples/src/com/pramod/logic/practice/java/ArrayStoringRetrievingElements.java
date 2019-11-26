package com.pramod.logic.practice.java;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStoringRetrievingElements {

    static  int[] array;
    public void setArrayElements(int a[]){
        System.out.println("Enter 10 number to store in Array");
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<a.length; i++){
            array[i]=scanner.nextInt();
        }
        System.out.println("You have inputted 10 number");
    }

    public void getArrayElemets(){
        System.out.println("Displaying 10 Array Elements");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        array=new int[10];
        ArrayStoringRetrievingElements as=new ArrayStoringRetrievingElements();
        as.setArrayElements(array);
        as.getArrayElemets();
    }
}
