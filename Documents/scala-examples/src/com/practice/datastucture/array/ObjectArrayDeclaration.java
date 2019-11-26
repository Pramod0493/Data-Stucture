package com.practice.datastucture.array;

import scala.reflect.internal.pickling.UnPickler;

import java.util.Scanner;

public class ObjectArrayDeclaration {
    public static void main(String[] args) {

        Student[] student=new Student[5];
        //Direct Initialize from object refererence

       /* student[0]=new Student(1,"pramod");
        student[1]=new Student(2,"ravi");
        student[2]=new Student(3,"kumar");
        student[3]=new Student(4,"deepak");
        student[4]=new Student(5,"suresh");
       */
       System.out.println("Enter the 5 Student Information");
       Scanner scanner=new Scanner(System.in);
       for(int i=0;i<student.length;i++){
           int id=scanner.nextInt();
           String name=scanner.next();
           student[i]=new Student(id,name);
       }


        for(Student std:student){
            System.out.println("Id:"+std.getId()+"\tName:"+std.getName());
        }
    }
}

