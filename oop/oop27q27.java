/*Question 27: Write a Java program to implement an Employee Salary Processor using POJO class.
Create a POJO class Employee with variables empId, basicSalary, and bonus.
Using getter and setter methods, calculate:
- Total Salary = basicSalary + bonus
- If salary > 50000 => High Salary
- Otherwise => Normal Salary
Input:
Enter Employee Id : 201
Enter Basic Salary : 40000
Enter Bonus : 15000

Output:
Employee Id : 201
Total Salary : 55000
Category : High Salary

Explanation:
A POJO class Employee has private fields: empId, basicSalary, bonus.
Setter methods store user-entered values. Getter methods retrieve them.
Total Salary = basicSalary + bonus = 40000 + 15000 = 55000.
Condition: if (totalSalary > 50000) => High Salary, else => Normal Salary.
Since 55000 > 50000, Category = High Salary.
This program demonstrates POJO encapsulation combined with business salary logic.

Asked In Companies:
Practice assignment*/

import java.util.Scanner;


class Employee{
    private int employeeid;
    private int basicsalary;
    private int bonus;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }


 public int getEmpId() {
        return empId;
    }

    public int getTotalSalary() {
        return basicSalary + bonus;
    }

    public String getCategory() {
        return getTotalSalary() > 50000 ? "High Salary" : "Normal Salary";
    }

}
public class oop27q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      Employee e = new Employee();

        System.out.print("Enter Employee Id : ");
        e.setemployeeId(sc.nextInt());

        System.out.print("Enter Basic Salary : ");
        e.setbasicsalary(sc.nextInt());

        System.out.print("Enter  Bonus");   
        e.setbonus(sc.nextInt());

        
        
        System.out.println("\n Enter Employee Id : " + e.setemployeeid());
        System.out.println("Total Salary: " + e.totalsalary());
        System.out.println("Category : " +e.getcategory());

        
    }
}