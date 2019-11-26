package org.training.scala.com.pramod.practice.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        List arrayList1=new ArrayList();

        arrayList1.add(100001);
        arrayList1.add("Pramod");
        arrayList1.add("Bhubaneswar");
        arrayList1.add(756100);

        ArrayList<String> al2=new ArrayList<String>();
        al2.add("Pramod");
        al2.add("Kumar");
        al2.add("Ravin");
        al2.add("pramod");
        al2.add("Hari");

        Iterator itr=al2.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        al2.remove(3);
        System.out.println("ArrayList Objects:"+al2);
    }
}
