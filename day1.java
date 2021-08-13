/* question 1
difference between complier and intrepter

1. Compiler: 
It is a translator which takes input as  High-Level Language, and produces an output of low-level language like
 machine or assembly language.

 2. Interpreter: 
An interpreter is a program that translates a programming language into a comprehensible language.
*/

/* question 2*/

package com.abc;
/*
java program to display student details
 */
import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        int marks [] = new int[5] ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of Student");
        String name = sc.next();
        System.out.println("Enter ROll no of Student");
        int roll = sc.nextInt();
        System.out.println("Enter Age of Student");
        int age = sc.nextInt();
        System.out.println("Enter marks of Student");
        for (int i=0;i<marks.length;i++){
            marks[i] =sc.nextInt();
        }
        System.out.println("Student Details are:  ");
        System.out.println("Name:  "+name+ "\nRoll No:  "+roll+"\nAge:  "+age+"\nMarks are: ");
        for (int i=0;i<marks.length;i++){
            System.out.println(" "+marks[i]);
        }
    }
}