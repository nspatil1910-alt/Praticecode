/*Question 30: Write a java program to display 1 to nth Perfect Number
Input:

n = 2

Output:

6 28

Explanation:

The first perfect number is 6.
The second perfect number is 28.
Both numbers are equal to the sum of their proper divisors.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping30{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Perfect Number");
        int n = sc .nextInt();
         int sum=0;
	     int count=0;
	 
	  while(count < n)
	  {
		  
		  for(int i = 1; i <= n; i++)
		  {
			  for(int j = 1; j <= n; j++)
			  {
			  if(i % j == 0)
			  
			    {
				 sum=sum+j;
		        }
				j++;
				
	          }    
	     if(i==sum)
	    {
		  System.out.println(i+" ");
		  
	    }
	     sum=0;
	  
   }
 }
   }
	  
 }     

