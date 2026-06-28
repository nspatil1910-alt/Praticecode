/*Question 28: Write a Java program to implement a Number Property Checker using POJO class.
Create a POJO class Number with variable num.
Using getter and setter methods, determine:
- Whether the number is Even or Odd
- Whether the number is Positive or Negative
Input:
Enter Number : -14

Output:
Number : -14
Even Number
Negative Number

Explanation:
A POJO class Number has private field num.
setNum(-14) stores the value. getNum() retrieves it for checking.
Even/Odd check: (-14) % 2 == 0 => Even Number.
Positive/Negative check: -14 < 0 => Negative Number.
Both checks run independently on the same stored value.
Note: The number -14 is both Even AND Negative, so two lines are printed.
This program shows how POJO encapsulation is used with two separate logical checks.

Asked In Companies:
Practice assignment*/

import java.util.Scanner;
class Number {
    private int num;
    public void setNum(int num) {
        this.num = num;
    }
    public int getNum() {
        return num;
    }
}

public class oop28q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Number n = new Number();

        System.out.print("Enter Number : ");
        int input = sc.nextInt();

        n.setNum(input);
    
        int num = n.getNum();
        System.out.println("Number : " + num);

        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        if (num >= 0) {
            System.out.println("Positive Number");
        } else {
            System.out.println("Negative Number");
        }


    }
}
