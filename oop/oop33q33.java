/*Question 33: Write a Java program to implement a Loan Eligibility Checker using POJO class.
Create a POJO class Loan with variables age and salary.
Determine loan eligibility:
- Age >= 21 AND Salary >= 25000 => Eligible
- Otherwise => Not Eligible
Input:
Enter Age : 30
Enter Salary : 28000

Output:
Age : 30
Salary : 28000
Loan Status : Eligible

Explanation:
A POJO class Loan has private fields: age and salary.
setAge(30) and setSalary(28000) store user input using setter methods.
Getter methods retrieve age and salary for the eligibility check.
Compound condition: if (age >= 21 && salary >= 25000) => Eligible.
Since age = 30 (>= 21) AND salary = 28000 (>= 25000), both conditions are true.
Loan Status = Eligible.
This is a POJO-based implementation of loan eligibility with compound conditions.

Asked In Companies:
Practice assignment*/

import java.util.Scanner;

class EligibilityChecker {

    public String checkEligibility(int age, long salary ) {

        if (age >= 30 && salary >= 28000) {
            return "Loan Status = Eligible";
        } else {
            return "Loan Status = Non Eligible";
        }
    }
}

public class oop33q33 {
    public static void main(String[] args) {

        EligibilityChecker obj = new EligibilityChecker();

        int age = 30;
         long salary = 28000;

        System.out.println(obj.checkEligibility(age ,salary));
        
    
    }
}
