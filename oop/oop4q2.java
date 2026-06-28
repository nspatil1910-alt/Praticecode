/*Question 2: Write a Java program to implement a Number Checker.
Create a class NumberCheck with a variable number.
Check whether the number is Even or Odd using a class object.
Input:
Enter Number : 45

Output:
Number : 45
Result : Odd Number

Explanation:
A class NumberCheck is created with an instance variable number.
An object of the class is created and the user enters a number using Scanner.
The condition used: if (number % 2 == 0) then Even, else Odd.
The modulo operator (%) gives the remainder when divided by 2.
Since 45 % 2 = 1 (not zero), the number is Odd.
If the user had entered 44, then 44 % 2 = 0, and it would print Even Number.
This program demonstrates class objects with basic arithmetic conditions.

Asked In Companies:
Practice assignment*/
import java.util.Scanner;
class NumberChecker {
    int number;

    void checkEvenOdd() {
        System.out.println("Enter Number : " + number);

        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}

class Student {
    void displayResult() {
        System.out.println("Result Displayed");
    }
}

public class oop4q2 {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.displayResult();

        NumberChecker n1 = new NumberChecker();
        n1.number = 8;

        n1.checkEvenOdd();
    }
}