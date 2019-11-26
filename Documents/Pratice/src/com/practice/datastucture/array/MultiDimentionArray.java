package com.practice.datastucture.array;

import java.util.Scanner;

public class MultiDimentionArray {
    public static void main(String[] args) {
        int array[][]=new int[2][2];

        System.out.println("Enter the 2D Array Elements");
        Scanner scanner=new Scanner(System.in);
      /*  for (int i=0 ;i<2;i++){
            for(int j=0;j<2;j++){
                array[i][j]=scanner.nextInt();
            }
        }
        */
        int p[][]={{5,10},{20,30}};
        System.out.println("Displaying the 2D Array Elements");
        for (int i=0 ;i<2;i++){
            for(int j=0;j<2;j++) {
                System.out.print(p[i][j]+"\t");
            }
            System.out.println();
        }
    }
}


