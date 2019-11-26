package com.practice.datastucture.array;

public class PassingArrayToMethod {

    public int[] getArray(int a[]){

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        return a;

    }

    public static void main(String[] args) {
        int a[]=new int[5];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;

        PassingArrayToMethod passArry=new PassingArrayToMethod();
        int[] arr = passArry.getArray(a);

        System.out.println("Displaying values from main method");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
