/*Question 4: Write a Java program to implement a Student Result System.
Create a class Student with attributes id, name, and marks.
Accept marks from the user and determine whether the student Passes or Fails.
If marks >= 35, print Pass, otherwise print Fail.
Input:
Enter Student Id : 101
Enter Student Name : Rahul
Enter Marks : 72

Output:
Student Id : 101
Student Name : Rahul
Marks : 72
Result : Pass

Explanation:
A class Student is created with three instance variables: id, name, and marks.
An object of the Student class is created in main() using: Student s = new Student();
The user inputs id, name, and marks using Scanner.
An if-else condition checks whether marks >= 35.
Since 72 >= 35, the result is Pass.
If the marks were less than 35, the result would be Fail.
This program teaches class creation, object instantiation, and conditional logic in Java.

Asked In Companies:
Practice assignment*/

import java.util.Scanner;
public class oop4q1{
    static class Student {
             int id;
           String name;
            int marks;

    void displayResult() {
        System.out.println("Student Id : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Marks : " + marks);

        if (marks >= 35) {
            System.out.println("Result : Pass");
        } else {
            System.out.println("Result : Fail");
        }
    }
    }

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();

        System.out.println("Enter Student id ");
         s1.id= sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Student Name");
         s1.name = sc.nextLine();

         System.out.println("Enter a Student Marks");
         s1.marks = sc.nextInt();

         s1.displayResult();
}
}