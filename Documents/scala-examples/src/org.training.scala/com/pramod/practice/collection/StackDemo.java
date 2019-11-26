package org.training.scala.com.pramod.practice.collection;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<String> s1=new Stack<String>();

        s1.push("Pruthvi");
        s1.push("Pramod");
        s1.push("Raja");
        s1.push("Suresh");
        s1.push("Ramesh");
       // s1.pop();

        Iterator itr=s1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Collection of Stack elements are:"+s1);

    }
}
