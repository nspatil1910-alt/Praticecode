/*Question 20: Write a Java program to implement a Power Calculator using Method Overloading.
Create a class Power and overload method calculate():
- calculate(int n) => Find square of n
- calculate(int n, int p) => Find n raised to power p
Input:
Enter number : 6
Enter number and power : 2 5

Output:
Square : 36
Power Result : 32

Explanation:
calculate(6):
- Square = n * n = 6 * 6 = 36.
calculate(2, 5):
- Power = 2 raised to 5 = 2 * 2 * 2 * 2 * 2 = 32.
- Implemented using Math.pow(n, p) or a loop.
Method overloading distinguishes the two methods by argument count.
Result 36 is a square. Result 32 = 2^5.
This program demonstrates exponentiation using overloaded methods.

Asked In Companies:
Practice assignment*/

import java.util.Scanner;

class Power {
    void calculate(int n) {
        int square = n * n;
        System.out.println("Square : " + square);
    }

    void calculate(int n, int p) {
        long result = 1;

        for (int i = 1; i <= p; i++) {
            result = result * n;
        }

        System.out.println("Power Result : " + result);
    }
}

public class oop20q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n1 = sc.nextInt();

        System.out.print("Enter number and power : ");
        int n2 = sc.nextInt();
        int p = sc.nextInt();

        Power obj = new Power();

        obj.calculate(n1);     
        obj.calculate(n2, p);   

    
    }
}