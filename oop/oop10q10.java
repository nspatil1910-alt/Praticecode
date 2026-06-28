/*Question 10: Write a Java program to implement a Student Grade Calculator.
Create a class StudentGrade with attributes name and marks.
Calculate grade based on marks:
- 80 to 100 => Grade A
- 60 to 79 => Grade B
- 40 to 59 => Grade C
- Below 40 => Fail
Input:
Enter Name : Priya
Enter Marks : 67

Output:
Name : Priya
Marks : 67
Grade : B

Explanation:
A class StudentGrade is created with name and marks as instance variables.
An object is created and user inputs name and marks.
The grade is determined using an if-else ladder:
- marks >= 80 && marks <= 100 => Grade A
- marks >= 60 && marks <= 79 => Grade B
- marks >= 40 && marks <= 59 => Grade C
- marks < 40 => Fail
Since marks = 67 falls in the 60-79 range, the Grade is B.
This program models a real-world grading system using class objects.

Asked In Companies:
Practice assignment*/

import java.util.Scanner;

class StudentGrade {
    String name;
    int  marks;
   

    void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student name : ");
        String name = sc.nextLine();

        sc.nextLine();

        System.out.print("Enter Student Marks: ");
        int marks = sc.nextInt();

       
    }

    void calculateGrade() {
        System.out.println("\nName : " + name);
        System.out.println("Marks : " + marks);

     

        if (marks >= 80 && marks <= 100) {
            System.out.println("Status: Grade A");
        } else if (marks >= 60 && marks <= 79 ) {
            System.out.println("Status: Grade B");
            } else if (marks >= 40 && marks <= 59) {
            System.out.println("Status: Grade C");

        } else {
            System.out.println("Status: Fail ");
        }
    }
}


public class oop10q10 {
    public static void main(String[] args) {
         StudentGrade sg = new StudentGrade();
        sg.inputDetails();
        sg.checkStatus();
        
    }
}