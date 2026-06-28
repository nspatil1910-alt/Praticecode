/*Question 3: Write a Java program to implement Employee Salary Classification.
Create a class Employee with attributes empId, name, and salary.
Determine salary category:
- Salary > 50000 => High Salary
- Salary 20000 to 50000 => Medium Salary
- Salary < 20000 => Low Salary
Input:
Enter Employee Id : 201
Enter Name : Amit
Enter Salary : 45000

Output:
Employee Id : 201
Name : Amit
Salary : 45000
Category : Medium Salary

Explanation:
A class Employee is created with instance variables empId, name, and salary.
An object is created and values are accepted from the user via Scanner.
An if-else ladder is used to classify the salary:
- salary > 50000 prints High Salary
- salary >= 20000 && salary <= 50000 prints Medium Salary
- salary < 20000 prints Low Salary
Since 45000 falls between 20000 and 50000, the category is Medium Salary.
This program teaches multi-condition if-else with class objects.

Asked In Companies:
Practice assignment*/

import java.util.Scanner;

class Employee {

    int empId;
    String name;
    double salary;

    public String getSalaryCategory() {

        if (salary > 50000) {
            return "High Salary";
        } else if (salary >= 20000 && salary <= 50000) {
            return "Medium Salary";
        } else {
            return "Low Salary";
        }
    }

    public void display() {
        System.out.println("Employee Id : " + empId);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Category : " + getSalaryCategory());
    }
}

public class oop4q3q {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter Employee Id : ");
        emp.empId = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter Name : ");
        emp.name = sc.nextLine();

        System.out.print("Enter Salary : ");
        emp.salary = sc.nextDouble();

        System.out.println();

        emp.display();
    }
}