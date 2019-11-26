package com.pramod.logic.practice.java;

import java.util.Scanner;

public class ReverseOfString1 {

    private String findReverOfString(String str) {
        char ch[]=str.toCharArray();
        System.out.println("String Hela: "+ch.toString()+"\t"+ch.length);
        String newStr=" ";

        for(int i=ch.length-1;i >=0;i--) {
            newStr = newStr + ch[i];
            System.out.println(newStr);
        }
        return newStr.trim();
    }
    public static void main(String[] args) {
        ReverseOfString1 reverseOfString = new ReverseOfString1();
        System.out.println("Please enter a string to test");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next().trim();
        String reverseString = reverseOfString.findReverOfString(str);

        System.out.println("str is:"+str);
        System.out.println("reverse string:"+reverseString);
        if(str.equalsIgnoreCase(reverseString) || (str.equals(reverseString))){
            System.out.println("Both string are pallendrom\t"+reverseString);
        }
        else{
            System.out.println("String are not Pallendrom\t"+reverseString);
        }

    }
}
