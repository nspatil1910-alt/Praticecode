/* 
Question 47: Write a Java program to implement Student Result Management using Menu-Driven approach.
Create a POJO class Student with attributes rollNo and marks.
Store records using array of objects.
Menu Operations:
1. Add Student
2. Display Students
3. Count Pass Students (marks >= 35)
4. Count Fail Students
5. Find Highest Marks
6. Exit
Input / Output Example:

Enter Choice : 1
Enter Roll No : 1
Enter Marks : 72
Output : Student Added Successfully

Enter Choice : 3
Output : Pass Students : 4

Enter Choice : 5
Output : Highest Marks : 88

Enter Choice : 6
Output : Exiting...

Explanation:
The menu-driven program runs inside a while(true) loop with switch-case.
Option 1 - Add: creates Student object, stores rollNo and marks via setters. count++.
Option 2 - Display: prints all students from index 0 to count-1.
Option 3 - Count Pass: loops through array, if getMarks() >= 35 => passCount++.
Option 4 - Count Fail: if getMarks() < 35 => failCount++.
Option 5 - Highest Marks: comparison loop finds maximum marks value.
Option 6 - Exit: breaks the while loop and terminates program.

Asked In Companies:
Practice assignment

*/

import java.util.Scanner;

class Student {
    private int rollNo;
    private int marks;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}

public class oop47q47 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[100];
        int count = 0;

        while (true) {
            System.out.println("\n----- Student Result Management -----");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Count Pass Students");
            System.out.println("4. Count Fail Students");
            System.out.println("5. Find Highest Marks");
            System.out.println("6. Exit");

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    Student s = new Student();

                    System.out.print("Enter Roll No : ");
                    s.setRollNo(sc.nextInt());

                    System.out.print("Enter Marks : ");
                    s.setMarks(sc.nextInt());

                    students[count] = s;
                    count++;

                    System.out.println("Student Added Successfully");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Students Available");
                    } else {
                        System.out.println("\nRollNo\tMarks");
                        for (int i = 0; i < count; i++) {
                            System.out.println(
                                students[i].getRollNo() + "\t" +
                                students[i].getMarks()
                            );
                        }
                    }
                    break;

                case 3:
                    int passCount = 0;

                    for (int i = 0; i < count; i++) {
                        if (students[i].getMarks() >= 35) {
                            passCount++;
                        }
                    }

                    System.out.println("Pass Students : " + passCount);
                    break;

                case 4:
                    int failCount = 0;

                    for (int i = 0; i < count; i++) {
                        if (students[i].getMarks() < 35) {
                            failCount++;
                        }
                    }

                    System.out.println("Fail Students : " + failCount);
                    break;

                case 5:
                    if (count == 0) {
                        System.out.println("No Students Available");
                    } else {
                        int highest = students[0].getMarks();

                        for (int i = 1; i < count; i++) {
                            if (students[i].getMarks() > highest) {
                                highest = students[i].getMarks();
                            }
                        }

                        System.out.println("Highest Marks : " + highest);
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}
