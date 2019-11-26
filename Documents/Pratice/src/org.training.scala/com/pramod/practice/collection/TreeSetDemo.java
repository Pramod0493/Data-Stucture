package org.training.scala.com.pramod.practice.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet t1=new TreeSet<String>();

        t1.add("Ravi");
        t1.add("Kumar");
        t1.add("Jiban");
        t1.add("Suresh");
        t1.add("Sumit");
        t1.add("Abhi");

        Iterator itr=t1.iterator();
        while(itr.hasNext()){
            System.out.println(""+itr.next());
        }
    }
}
