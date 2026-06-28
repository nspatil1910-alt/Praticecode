/*Question 16: Write a Java program to implement Number Operation using Method Overloading.
Create a class NumberOperation and overload method calculate():
- calculate(int a, int b) => Find addition of two numbers
- calculate(int a, int b, int c) => Find the largest among three numbers
Input:
Enter two numbers : 10 20
Enter three numbers : 12 45 30

Output:
Addition : 30
Largest Number : 45

Explanation:
Method overloading allows the same method name to perform different tasks based on parameters.
calculate(int a, int b):
- Adds two numbers: 10 + 20 = 30. Prints Addition : 30.
calculate(int a, int b, int c):
- Finds largest using if-else: 12, 45, 30 => 45 is the largest.
Java automatically selects the correct method based on number of arguments.
This is compile-time polymorphism (method overloading).
Method overloading improves code readability by using one name for related operations.

Asked In Companies:
Practice assignment*/

import java.util.Scanner;
public class oop16q16 {
    void calculate(int a, int b) {
        int sum = a + b;
        System.out.println("Addition : " + sum);
    }

    void calculate(int a, int b, int c) {
        int largest = a;

        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }

        System.out.println("Largest Number : " + largest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter three numbers : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        oop16q16 obj = new oop16q16();

        obj.calculate(a, b);
        obj.calculate(x, y, z);
    }
}