/*Question 18: Write a java program to find the first and last digit of a number.
Input:

Number = 1234

Output:

First Digit = 1
Last Digit = 4

Explanation:

Last digit is found using number % 10.
First digit is found by dividing the number until it becomes a single digit.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.println("Enter a number");
		int number =sc.nextInt();
		 int num=Math.abs(number);
        int lastdigit=number%10;
        int firstdigit=num;
        while(firstdigit>=10)
		{
			firstdigit=firstdigit/10;
		
		}
          System.out.println("The first digit number " + number+ " is  "+    firstdigit);
            System.out.println("The last digit number " + number+ " is  "+   lastdigit);		  
	}

    }
