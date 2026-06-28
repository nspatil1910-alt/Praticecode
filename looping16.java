/*Question 16: Write a java program to find power of a number.
Input:

Base = 2
Exponent = 3

Output:

Result = 8

Explanation:

2 raised to the power 3 means 2 × 2 × 2.
The result is 8.

Asked In Companies:
Just Practice assignment*/
import java.util.Scanner;
public class looping16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int result=1;
		System.out.println("Enter a exponent power");
		int exponent =sc.nextInt();
		System.out.println("Enter a base power");
	    int base =sc.nextInt();
		int i=1;
		for(i=1;i<=exponent;i++)
		{
			result=result*base;
			{
				System.out.println("result is"+result);
			}
		}
    }
}