package org.training.scala.com.pramod.practice.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<String> v1=new Vector<String>();

        v1.add("Pramod");
        v1.add("Kumar");
        v1.add("Ravin");
        v1.add("Suresh");
        v1.add("Kumar");

        Iterator itr=v1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
