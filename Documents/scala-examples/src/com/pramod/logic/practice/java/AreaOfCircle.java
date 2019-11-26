/*Find the area of the circle by using static method developed by Pramod*/

package com.pramod.logic.practice.java;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {

        System.out.println("Enter the radius of circle");
        Scanner scanner=new Scanner(System.in);
        double r=scanner.nextDouble();

        //Formula to find circle is pi*r2/100
        double areaOfCircle=(22*r*r)/7;
        System.out.println("Area of circle is:"+areaOfCircle);
        System.out.println("Thank you");
    }
}
/* Output
Enter the radius of circle
7
Area of circle is:154.0
Thank you
* */