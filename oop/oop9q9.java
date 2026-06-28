/*Question 9: Write a Java program to implement a Triangle Type Identifier.
Create a class Triangle with attributes side1, side2, side3.
Identify triangle type:
- All sides equal => Equilateral
- Two sides equal => Isosceles
- All sides different => Scalene
Input:
Enter Side1 : 5
Enter Side2 : 5
Enter Side3 : 5

Output:
Triangle Type : Equilateral Triangle

Explanation:
A class Triangle is created with three instance variables: side1, side2, side3.
User enters all three side values.
Conditions used:
- if (side1 == side2 && side2 == side3) => Equilateral Triangle
- else if (side1 == side2 || side2 == side3 || side1 == side3) => Isosceles Triangle
- else => Scalene Triangle
Since all three sides are 5, the condition side1 == side2 == side3 is true.
Output: Equilateral Triangle
This program demonstrates logical AND and OR operators with class objects.

Asked In Companies:
Practice assignment*/

import java.util.Scanner;

class Triangle {
    int side1;
    int  side2;
    int  side3;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Side: ");
        side1 = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Second Side: ");
        side2 = sc.nextInt();

        System.out.print("Enter Thrid Side: ");
        side3 = sc.nextInt();
    }

     void checkStatus() {
        System.out.println("\nSides: " + side1 + ", " + side2 + ", " + side3);

        if (side1 == side2 && side2 == side3) {
            System.out.println("Status: Equilateral Triangle ");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("Status: Isosceles Triangle ");
        } else {
            System.out.println("Status: Scalene Triangle");
        }
    }
}

public class oop9q9 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.inputDetails();
        t.checkStatus();
        
    }
}