/*Question 40: Write a Java program to print all automorphic numbers between 1 and n. An automorphic number’s square ends with the number itself (e.g., 5² = 25).
Explanation:
Use loop to check square and a while loop to match last digits.
Input:

n = 100

Output:

1 5 6 25 76

Explanation:

Example:
5² = 25 ? ends with 5
25² = 625 ? ends with 25
Such numbers are called Automorphic Numbers.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping40{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
		 int square = n * n;
		 int temp = n;
		 
		 boolean isAutomorphic = true;
		  
		 while(temp>0)
		 {
			 if(temp%10!=square%10)
			 {
				 isAutomorphic = false;
				 break;
			 }
			 temp= temp/10;
			 square=square/10;
		 }
		 if(isAutomorphic)
		 {
			 System.out.println(n+" Automorphic Number ");
		 }
		 else
		 {
			 System.out.println(n+" Not Automorphic Number");
		 }
	 
  }
}