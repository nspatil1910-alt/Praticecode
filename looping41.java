/*Question 41: Write a Java program to find the largest and smallest digit of a given number.
Explanation:
Use a while loop to extract digits, compare each digit to track max and min.
Input:

Number = 583902

Output:

Largest Digit = 9
Smallest Digit = 0

Explanation:

The program extracts each digit using a while loop.
Each digit is compared to track maximum and minimum values.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping41{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = sc.nextInt();
      
         number = Math.abs(number);

        int largest = 0;
        int smallest = 9;

        while (number > 0) {
            int digit = number % 10;

            if (digit > largest) {
                largest = digit;
            }

            if (digit < smallest) {
                smallest = digit;
            }

            number = number / 10;
        }

        System.out.println("Largest Digit = " + largest);
        System.out.println("Smallest Digit = " + smallest);
    }
}
	  
