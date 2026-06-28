/*Question 28: Write a java program to Check Number Is Spy Number or Not.
Example : A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
Input:

Number = 1412

Output:

Spy Number

Explanation:

Sum = 1 + 4 + 1 + 2 = 8
Product = 1 × 4 × 1 × 2 = 8
Since sum equals product, it is a Spy Number.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping29 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
	  int num=sc.nextInt();
      int temp=num;
	  int sum=0;
	  int product =1;
	  int digit =0;
	  while(num!=0)
	  {
		  digit = num %10;
		  sum = sum+digit;
		  product = product * digit;
		  num = num /10;
	  }
	  if(sum == product)
	  {
		  System.out.println(" It Is Spy Number");
	  }
	  else
	  {
		  System.out.println(" It Is Not Spy Number");
	  }
   }
 }
