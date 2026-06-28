/*Question 36: Write a Java program to implement Employee Salary Management using Array of Objects.
Create a POJO class Employee with attributes empId, empName, and salary.
Store details of N employees using array of objects.
Perform:
1. Display all employees
2. Find employee with highest salary
3. Find employee with lowest salary
Input:
Enter number of employees : 3

Enter Employee Id : 101
Enter Employee Name : Amit
Enter Salary : 45000

Enter Employee Id : 102
Enter Employee Name : Neha
Enter Salary : 52000

Enter Employee Id : 103
Enter Employee Name : Rahul
Enter Salary : 38000

Output:
Emp Id : 101 Name : Amit Salary : 45000
Emp Id : 102 Name : Neha Salary : 52000
Emp Id : 103 Name : Rahul Salary : 38000

Highest Salary Employee : Neha - 52000
Lowest Salary Employee : Rahul - 38000

Explanation:
Employee emp[] = new Employee[3] creates an array of 3 Employee references.
Each emp[i] = new Employee() creates individual objects.
Setters store empId, empName, salary. Getters retrieve them for display.
Highest salary: loop through all, compare getSalary() => 52000 (Neha).
Lowest salary: loop through all, compare getSalary() => 38000 (Rahul).
Array of objects is the correct way to store and process multiple records in Java.

Asked In Companies:
Practice assignment*/

import java.util.Scanner;

class Employee {
    private int empId;
    private String empName;
    private double salary;

    
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }
}

public class oop36q36{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees : ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee emp[] = new Employee[n];

        
        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();

            System.out.println("\nEnter Employee " + (i + 1) + " Details");

            System.out.print("Enter Employee Id : ");
            emp[i].setEmpId(sc.nextInt());
            sc.nextLine();

            System.out.print("Enter Employee Name : ");
            emp[i].setEmpName(sc.nextLine());

            System.out.print("Enter Salary : ");
            emp[i].setSalary(sc.nextDouble());
        }

    
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Emp Id : " + emp[i].getEmpId() +" Name : " + emp[i].getEmpName() +  " Salary : " + emp[i].getSalary());
        }

        
        Employee highest = emp[0];
        Employee lowest = emp[0];

        for (int i = 1; i < n; i++) {
            if (emp[i].getSalary() > highest.getSalary()) {
                highest = emp[i];
            }

            if (emp[i].getSalary() < lowest.getSalary()) {
                lowest = emp[i];
            }
        }

        System.out.println("\nHighest Salary Employee : "+ highest.getEmpName() + " - " + highest.getSalary());

        System.out.println("Lowest Salary Employee : "+ lowest.getEmpName() + " - "+ lowest.getSalary());

        
    }
}