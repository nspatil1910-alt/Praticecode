/*Question 11: Write a java program to calculate the sum of digits in a number.
Input:

Number = 1234

Output:

Sum of digits = 10

Explanation:

The program separates each digit using modulus (%) and division (/).
Digits are 1, 2, 3, 4 and their sum is 1 + 2 + 3 + 4 = 10.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num =  sc.nextInt();

        int sum=0;
            while( num !=0){
            int digit =num % 10;
            sum = sum + digit;
            num = num/10;
        }
          System.out.println("Sum of digits = " + sum);
    }
    }
