/*Question 11: Write a Java program to implement an Employee Bonus System.
Create a class Employee with attributes empId, name, salary, and yearsOfExperience.
Calculate bonus:
- Experience > 10 years => 20% bonus
- Experience 5 to 10 years => 10% bonus
- Experience < 5 years => 5% bonus
Display total salary after bonus.
Input:
Enter Employee Id : 501
Enter Name : Anil
Enter Salary : 40000
Enter Experience : 8

Output:
Employee Id : 501
Name : Anil
Salary : 40000
Bonus : 4000
Total Salary : 44000

Explanation:
A class Employee is created with empId, name, salary, and yearsOfExperience.
Bonus percentage is decided based on experience:
- experience > 10 => 20% bonus
- experience >= 5 && experience <= 10 => 10% bonus
- experience < 5 => 5% bonus
Since experience = 8 (between 5 and 10):
Bonus = 40000 * 10 / 100 = 4000
Total Salary = 40000 + 4000 = 44000
This program demonstrates percentage-based bonus calculation using class objects.

Asked In Companies:
Practice assignment*/

import java.util.Scanner;

class Employee {

    int empId;
    String name;
    double salary;
    int experience;

    public String getSalaryCategory() {

        if (experience>10 ) {
            return "20% bonus";
        } else if ( experience>= 5 && experience <= 10) {
            return "10% bonus";
        } else {
            return "5% bonus";
        }
    }

    public void display() {
        System.out.println("Employee Id : " + empId);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Category : " + getSalaryCategory());
    }
}

public class oop11q11{

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
    
        System.out.print("Enter Experience :");
        emp.experience=  sc.nextInt();

        System.out.println();

        emp.display();
    }
}