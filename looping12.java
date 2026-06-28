/*Question 12: Write a java program to calculate the product of digits in a number.
Input:

Number = 1234

Output:

Product of digits = 24

Explanation:

Digits are extracted one by one.
1 × 2 × 3 × 4 = 24.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping12{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();
   
        int product = 1 ;

         while (num > 0) {
            int digit = num % 10;   
            product = product * digit;
            num = num / 10;        
        }

        System.out.println("Product of digits = " + product);
    }

    }