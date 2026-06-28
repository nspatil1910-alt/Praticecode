/*Question 14: Write a java program to check whether a number is palindrome or not.
Input:

Number = 121

Output:

Palindrome

Explanation:

The reversed number of 121 is also 121.
Since original and reversed numbers are equal, it is a palindrome.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num=sc.nextInt();
         int rev=0;
        int org_num=0;

        if(org_num==rev){
            System.out.println(" Palindrome");
        }
        else{
            System.out.println( "not palindrome ");
        }

    }

}