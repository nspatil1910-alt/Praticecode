/*Question 4: Write a Java program to implement a Voting Eligibility Checker.
Create a class Person with attributes name and age.
Check whether the person is eligible for voting.
Condition: Age >= 18 => Eligible, Otherwise => Not Eligible.
Input:
Enter Name : Rohan
Enter Age : 16

Output:
Name : Rohan
Age : 16
Result : Not Eligible for Voting

Explanation:
A class Person is created with instance variables name and age.
An object is created and user inputs name and age using Scanner.
Condition: if (age >= 18) => Eligible for Voting, else => Not Eligible for Voting.
Since age = 16, which is less than 18, the result is Not Eligible for Voting.
If age were 18 or above (e.g., 20), the result would be Eligible for Voting.
This program demonstrates how class attributes are used with real-world conditional logic.

Asked In Companies:
Practice assignment*/

import java.util.Scanner;

class EligibilityChecker {

    public String checkEligibility(int age) {

        if (age >= 18) {
            return "Eligible for Voting";
        } else {
            return "Not Eligible for Voting";
        }
    }
}

public class oop4q4 {
    public static void main(String[] args) {

        EligibilityChecker obj = new EligibilityChecker();

        int age = 14;

        System.out.println(obj.checkEligibility(age));
    }
}