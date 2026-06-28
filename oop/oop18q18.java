/*Question 18: Write a Java program to implement a Salary Calculator using Method Overloading.
Create a class Salary and overload method salary():
- salary(int basic) => Print basic salary
- salary(int basic, int bonus) => Calculate total salary
- salary(int basic, int bonus, int tax) => Calculate final salary after tax
Input:
Enter Basic Salary : 20000
Enter Bonus : 5000
Enter Tax : 2000

Output:
Basic Salary : 20000
Total Salary : 25000
Final Salary : 23000

Explanation:
Three overloaded versions of salary() are created:
salary(20000):
- Prints Basic Salary = 20000 directly.
salary(20000, 5000):
- Total Salary = basic + bonus = 20000 + 5000 = 25000.
salary(20000, 5000, 2000):
- Final Salary = Total Salary - Tax = 25000 - 2000 = 23000.
Each version is called in sequence and Java picks the correct overload.
This demonstrates real-world payroll logic using method overloading.

Asked In Companies:
Practice assignment*/

import java.util.Scanner;
class SalaryCalculator {


    double calculateSalary(double basic) {
        return basic;
    }

    
    double calculateSalary(double basic, double allowance) {
        return basic + allowance;
    }

    
    double calculateSalary(double basic, double allowance, double bonus) {
        return basic + allowance + bonus;
    }
}
    public class oop18q18{
    public static void main(String[] args) {

        SalaryCalculator sc = new SalaryCalculator();

        double salary1 = sc.calculateSalary(25000);
        double salary2 = sc.calculateSalary(25000, 23000);
        double salary3 = sc.calculateSalary(20000, 25000, 23000);

        System.out.println("Salary : " + salary1);
        System.out.println("Salary : " + salary2);
        System.out.println("Salary : " + salary3);
    }
}