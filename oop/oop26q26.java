/*Question 26: Write a Java program to implement a Student Result Analyzer using POJO class.
Create a POJO class Student with variables rollNo, marks1, marks2, and marks3.
Accept values using getter and setter methods and calculate:
- Total marks
- Average marks
- Result (Pass if average >= 40, otherwise Fail)
Input:
Enter Roll No : 101
Enter Marks1 : 60
Enter Marks2 : 50
Enter Marks3 : 45

Output:
Roll No : 101
Total Marks : 155
Average : 51.66
Result : Pass

Explanation:
A POJO (Plain Old Java Object) class Student has private fields: rollNo, marks1, marks2, marks3.
Public setter methods (setRollNo, setMarks1, setMarks2, setMarks3) assign values.
Public getter methods (getRollNo, getMarks1, etc.) retrieve values.
Total = marks1 + marks2 + marks3 = 60 + 50 + 45 = 155.
Average = Total / 3.0 = 155 / 3.0 = 51.66.
Since 51.66 >= 40, Result = Pass.
POJO classes promote data encapsulation by keeping fields private.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;
class Student {
    private int rollNo;
    private int marks1;
    private int marks2;
    private int marks3;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getMarks1() {
        return marks1;
    }
    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    
    }
    public int getMarks2() {
        return marks2;
    }
    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }
    public int getMarks3() {
        return marks3;
    }
    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }
    public int getTotal() {
        return marks1 + marks2 + marks3;
    }

    public double getAverage() {
        return getTotal() / 3.0;
    }

    public String getResult() {
        return getAverage() >= 40 ? "Pass" : "Fail";
    }
}


public class oop26q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter Roll No : ");
        s.setRollNo(sc.nextInt());

        System.out.print("Enter Marks1 : ");
        s.setMarks1(sc.nextInt());

        System.out.print("Enter Marks2 : ");
        s.setMarks2(sc.nextInt());

        System.out.print("Enter Marks3 : ");
        s.setMarks3(sc.nextInt());

        
        System.out.println("\nRoll No : " + s.getRollNo());
        System.out.println("Total Marks : " + s.getTotal());
        System.out.printf("Average : %.2f\n", s.getAverage());
        System.out.println("Result : " + s.getResult());

        
    }
}