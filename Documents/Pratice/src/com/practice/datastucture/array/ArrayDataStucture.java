package com.practice.datastucture.array;

import java.util.Scanner;

public class ArrayDataStucture {

    public static void main(String[] args) {
        int array[]=new int[5];
        Scanner scanner=new Scanner(System.in);

        //Taking array Elements
        System.out.println("Enter Array Elements");
        for(int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        //Displaying Array Elements
        for (int arr: array){
            System.out.println(arr);
        }
    }
}
