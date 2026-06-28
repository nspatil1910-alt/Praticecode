/*Question 46: Write a Java program to implement Employee Management System using Menu-Driven approach.
Create a POJO class Employee with attributes empId and salary.
Store records using array of objects.
Menu Operations:
1. Add Employee
2. Display Employees
3. Find Highest Salary Employee
4. Find Lowest Salary Employee
5. Exit
Input / Output Example:

Enter Choice : 1
Enter Employee Id : 101
Enter Salary : 45000
Output : Employee Added Successfully

Enter Choice : 2
Output :
Emp Id : 101 Salary : 45000

Enter Choice : 3
Output :
Highest Salary Employee : 102
Salary : 55000

Enter Choice : 5
Output : Exiting...

Explanation:
A menu-driven program uses a while(true) loop with switch-case for each option.
Option 1 - Add: creates Employee object, sets empId and salary, stores in array. Increments count.
Option 2 - Display: loops through array from index 0 to count-1, prints each employee.
Option 3 - Highest Salary: compares getSalary() of all employees, prints the one with max salary.
Option 4 - Lowest Salary: similarly finds minimum salary employee.
Option 5 - Exit: uses break or System.exit(0) to terminate the loop.
This program combines POJO, array of objects, and menu-driven design.

Asked In Companies:
Practice assignment

*/

import java.util.Scanner;

class Employee {
    private int empId;
    private double salary;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

public class oop46q46{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee[] emp = new Employee[100];
        int count = 0;

        while (true) {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Find Highest Salary Employee");
            System.out.println("4. Find Lowest Salary Employee");
            System.out.println("5. Exit");

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < emp.length) {
                        emp[count] = new Employee();

                        System.out.print("Enter Employee Id : ");
                        emp[count].setEmpId(sc.nextInt());

                        System.out.print("Enter Salary : ");
                        emp[count].setSalary(sc.nextDouble());

                        count++;

                        System.out.println("Employee Added Successfully");
                    } else {
                        System.out.println("Employee Array Full");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Employees Found");
                    } else {
                        System.out.println("\nEmployee Details:");
                        for (int i = 0; i < count; i++) {
                            System.out.println("Emp Id : " +
                                    emp[i].getEmpId() +
                                    " Salary : " +
                                    emp[i].getSalary());
                        }
                    }
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("No Employees Found");
                    } else {
                        Employee highest = emp[0];

                        for (int i = 1; i < count; i++) {
                            if (emp[i].getSalary() > highest.getSalary()) {
                                highest = emp[i];
                            }
                        }

                        System.out.println("Highest Salary Employee : "
                                + highest.getEmpId());
                        System.out.println("Salary : "
                                + highest.getSalary());
                    }
                    break;

                case 4:
                    if (count == 0) {
                        System.out.println("No Employees Found");
                    } else {
                        Employee lowest = emp[0];

                        for (int i = 1; i < count; i++) {
                            if (emp[i].getSalary() < lowest.getSalary()) {
                                lowest = emp[i];
                            }
                        }

                        System.out.println("Lowest Salary Employee : "
                                + lowest.getEmpId());
                        System.out.println("Salary : "
                                + lowest.getSalary());
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
