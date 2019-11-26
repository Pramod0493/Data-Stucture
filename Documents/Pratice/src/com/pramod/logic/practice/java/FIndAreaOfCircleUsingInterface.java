/*Finding Redius of circle using interface*/

package com.pramod.logic.practice.java;

import java.util.Scanner;

interface Circle {
    void circleArea();
}

public class FIndAreaOfCircleUsingInterface implements Circle {

    double redius;

    @Override
    public void circleArea() {
        System.out.println("Enter the Circle redius");
        Scanner scanner=new Scanner(System.in);
        redius=scanner.nextDouble();
        Double cicleRedius=22*redius*redius/7;
        System.out.println("Redius of Circle is :"+cicleRedius);
    }

    public static void main(String[] args) {
        Circle findRediusObj=new FIndAreaOfCircleUsingInterface();
        findRediusObj.circleArea();
        System.out.println("Thank you");


    }
}
