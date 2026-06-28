/*Question 23: Write a java program to Check Number Is Duck Number or Not.
Example : A Duck number is a positive number which has zeroes present in it, For example 3210, 8050896, 70709 are all Duck numbers.
Please note that a number with only leading 0s is not considered a Duck Number.
For example, numbers like 035 or 0012 are not considered as Duck Numbers.
Input:

Number = 3210

Output:

Duck Number

Explanation:

The number contains zero and does not start with zero.
Therefore, it is a Duck Number

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping23 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.print("Number Is Duck Number");
     int num =sc.nextInt();
	   boolean b=false;
	   while(num>0)
	   {
		   int rem=num%10;
		   num=num/10;
		   if(rem==0)
		   {
			   System.out.println("it is a duck number");
			   b=true;
			   break;
		   }
	   }
	       if(!b){
			   System.out.println("it is not duck number");
		   }
      }
    }