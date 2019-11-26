package org.training.scala.com.pramod.practice.collection;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

        Set<String> s1=new TreeSet<String>();

        s1.add("pramod");
        s1.add("ravi");
        s1.add("kumar");
        s1.add("ravin");
        s1.add("ravi");
        s1.add("pramod");

        Iterator itr=s1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("HashSet Objects:"+s1);



        Set<Integer> s2=new HashSet<Integer>();

        s2.add(101);
        s2.add(102);
        s2.add(103);
        s2.add(104);
        s2.add(null);

        Set<Integer> s3=new HashSet<Integer>();
        s3.addAll(s2);

        System.out.println(s2);
        s3.remove(0);
        System.out.println("S3"+s3);

    }
}
