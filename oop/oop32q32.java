/*Question 32: Write a Java program to implement a Triangle Validator using POJO class.
Create a POJO class Triangle with variables side1, side2, and side3.
Determine the triangle type:
- All sides equal => Equilateral
- Two sides equal => Isosceles
- All sides different => Scalene
Input:
Enter Side1 : 5
Enter Side2 : 5
Enter Side3 : 8

Output:
Triangle Type : Isosceles

Explanation:
A POJO class Triangle has private fields: side1, side2, side3.
Setters accept user input. Getters are used in the type-checking logic.
Conditions:
- if (side1 == side2 && side2 == side3) => Equilateral
- else if (side1 == side2 || side2 == side3 || side1 == side3) => Isosceles
- else => Scalene
Since side1 = 5 and side2 = 5 (two sides equal), the type is Isosceles.
side3 = 8 is different from side1 and side2.
This shows conditional logic applied to POJO class data.

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
        } else if (side1 == side2 || side2 == side3 ||\side1 == side3) {
            System.out.println("Status: Isosceles Triangle ");
        } else {
            System.out.println("Status: Scalene Triangle");
        }
    }
}

public class oop32q32 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.inputDetails();
        t.checkStatus();
        
    }
}