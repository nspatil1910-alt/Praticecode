/*Question 20: Write a java program to swap first and last digits of a number.
Input:

Number = 1234

Output:

Swapped Number = 4231

Explanation:

First digit (1) and last digit (4) are interchanged.
Middle digits remain the same.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping20{

    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
         
       System.out.println("Enter a Number");
       int num = sc.nextInt();
       
        int original = num;

        int lastDigit = num ;
        int firstDigit = num;
        int digits = 0;

        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
            digits++;
        }


        int middle = original % (int)Math.pow(10, digits);
        middle = middle / 10;

    
        int swapped =
                lastDigit * (int)Math.pow(10, digits) +
                middle * 10 +
                firstDigit;

        System.out.println("Swapped Number = " + swapped);
    }
}

  