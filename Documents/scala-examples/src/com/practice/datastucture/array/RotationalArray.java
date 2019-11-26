package com.practice.datastucture.array;

import java.util.Scanner;

public class RotationalArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Array Elements");

        int array[] = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Original Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+array[i]);
        }

        rotationArray(array, 4, array.length);
    }

    private static void rotationArray(int[] array, int d, int length) {
        int idx = findArrayIndexElement(array, d);

        System.out.println();
        for(int i=idx;i<array.length;i++){
            System.out.print(" "+array[i]);
        }

        for(int i=0;i<array[idx]-1;i++){
            System.out.print(" "+array[i]);
        }
    }


    //Finding Array Index number
    private static int findArrayIndexElement(int a[], int d) {

        int i = 0, index = 0;
        while (i < a.length) {
            if (a[i] == d) {
                index = d;
            }
            i++;
        }
        return index;
    }
}
// 2 4 1 2 3 4 6