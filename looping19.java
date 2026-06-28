/*Question 19: Write a java program to find the sum of the first and last digit of a number.
Input:

Number = 1234

Output:

Sum = 5

Explanation:

First digit = 1
Last digit = 4
Sum = 1 + 4 = 5.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int lastDigit = num % 10;  
        int firstDigit = num;
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10; 
        }

        int sum = firstDigit + lastDigit;

        System.out.println("First digit: " + firstDigit);
        System.out.println("Last digit: " + lastDigit);
        System.out.println("Sum = " + sum);
    }
             
        }
   