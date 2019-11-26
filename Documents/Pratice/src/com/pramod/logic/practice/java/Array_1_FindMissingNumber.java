package com.pramod.logic.practice.java;

public class Array_1_FindMissingNumber {


    public static void main(String[] args) {

        int array1[]={1,2,8,5,6,3,7};
        int missingNum=findingMixingNumber(array1);
        System.out.println("Missing Number:\t"+missingNum);

    }


    private static int findingMixingNumber(int[] array) {
        int n=array.length+1;
        System.out.println(n);
        int totalSum=n*(n+1)/2;
        System.out.println(totalSum);
        int calcSum=0;

        for(int i=0;i<array.length;i++){
            calcSum=calcSum+array[i];
        }
        System.out.println(calcSum);
        return (totalSum-calcSum);
    }
}

