/*Question 32: Write a java program to display 1 to nth Strong Number.
Input:

n = 3

Output:

1 2 145

Explanation:

1 and 2 are Strong Numbers because 1! = 1 and 2! = 2.
145 is also a Strong Number because 1! + 4! + 5! = 145.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping32 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Strong Number");
        int num = sc.nextInt();
      
      int temp = num;
        int sum = 0;

while(temp != 0)
{
    int rem = temp % 10;
    int fact = 1;

    while(rem != 0)
    {
        fact = fact * rem;
        rem--;
    }

    sum = sum + fact;
    temp = temp / 10;
}

if(num == sum)
{
    System.out.println("It is Strong Number");
}
else
{
    System.out.println("It is Not Strong Number");
}
     }
    }
	