/*Question 37: Write a java program to find LCM of two numbers.
Input:

Number1 = 12
Number2 = 18

Output:

LCM = 36

Explanation:

LCM is the smallest number that is divisible by both 12 and 18.
36 is divisible by both numbers.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping37{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number");
        int num1 = sc.nextInt();
        System.out.println("Enter second Number");
        int num2 = sc.nextInt();
        int HCF =1;
	     int i =1;
	  int min=(num1<num2)?num1:num2;
	  
	  while(i<=min)
	  {
		  if(num1%i==0 && num2%i==0)
		  {
			  HCF=i;
		  }
		  i++;
	  }
	  System.out.println(" The HCF is "+HCF);
	    int LCM = (num1 * num2) / HCF;
       System.out.println(" The LCM is "+LCM);
	 
   }
    }
