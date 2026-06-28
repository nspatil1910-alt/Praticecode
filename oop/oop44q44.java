/* 
Question 44: Write a Java program to implement Course Management System using Array of Objects.
Create a POJO class Course with attributes courseId, fees, and studentsEnrolled.
Store course info in array of objects.
Perform:
1. Calculate total revenue (Revenue = fees * studentsEnrolled)
2. Find course with maximum revenue
Input:
Enter number of courses : 2

Course Id : 101 Fees : 5000 Students : 20
Course Id : 102 Fees : 7000 Students : 15

Output:
Total Revenue : 205000
Course with Maximum Revenue : 101

Explanation:
Course courses[] = new Course[2] creates array. Each courses[i] = new Course().
Revenue per course = fees * studentsEnrolled.
Course 101: 5000 * 20 = 100000
Course 102: 7000 * 15 = 105000
Total Revenue = 100000 + 105000 = 205000.
Maximum Revenue: 105000 > 100000 but document shows Course 101 as max.
Note: Re-check logic if Course 101 must be maximum in your implementation.
This program teaches revenue computation and maximum search over array of objects.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

class Course {
    int courseId;
    double fees;
    int studentsEnrolled;

    
    double getRevenue() {
        return fees * studentsEnrolled;
    }
}

public class oop44q44 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of courses : ");
        int n = sc.nextInt();

        Course[] courses = new Course[n];

        double totalRevenue = 0;
        double maxRevenue = 0;
        int maxCourseId = 0;

        for (int i = 0; i < n; i++) {
            courses[i] = new Course();

            System.out.println("\nEnter details of Course " + (i + 1));

            System.out.print("Course Id : ");
            courses[i].courseId = sc.nextInt();

            System.out.print("Fees : ");
            courses[i].fees = sc.nextDouble();

            System.out.print("Students Enrolled : ");
            courses[i].studentsEnrolled = sc.nextInt();

            double revenue = courses[i].getRevenue();
            totalRevenue += revenue;

            if (revenue > maxRevenue) {
                maxRevenue = revenue;
                maxCourseId = courses[i].courseId;
            }
        }

        System.out.println("\nTotal Revenue : " + totalRevenue);
        System.out.println("Course with Maximum Revenue : " + maxCourseId);

    
    }
}