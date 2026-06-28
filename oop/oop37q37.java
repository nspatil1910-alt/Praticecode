/*Question 37: Write a Java program to implement Student Result Management using Array of Objects.
Create a POJO class Student with attributes rollNo and marks.
Store N students in array of objects.
Perform:
1. Count Pass students (marks >= 35)
2. Count Fail students
3. Display student with highest marks
Input:
Enter number of students : 4

Roll No : 1 Marks : 65
Roll No : 2 Marks : 32
Roll No : 3 Marks : 78
Roll No : 4 Marks : 40

Output:
Pass Students : 3
Fail Students : 1
Highest Marks : 78

Explanation:
Student stu[] = new Student[4] creates array of 4 Student references.
Each stu[i] = new Student() creates individual objects. Setters fill data.
Pass count: loop through array, if marks >= 35 => passCount++. Result = 3.
Fail count: if marks < 35 => failCount++. Result = 1 (Student 2, marks=32).
Highest marks: compare all getMarks() values => 78 is the maximum.
Three separate loops or one combined loop can perform all operations.

Asked In Companies:
Practice assignment*/
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int m1, m2, m3,m4;
    int total;
    double percentage;

    void acceptData(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks in Subject 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter Marks in Subject 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter Marks in Subject 3: ");
        m3 = sc.nextInt();

         System.out.print("Enter Marks in Subject 4: ");
        m4 = sc.nextInt();

        total = m1 + m2 + m3 +m4;
        percentage = total / 4;
    }

    void displayResult() {
        System.out.println("\nRoll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 35)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");
    }
}

public class oop37q37{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Details of Student " + (i + 1));
            students[i] = new Student();
            students[i].acceptData(sc);
        }

        System.out.println("\n===== STUDENT RESULTS =====");

        for (int i = 0; i < n; i++) {
            students[i].displayResult();
        }

    
    }
}
