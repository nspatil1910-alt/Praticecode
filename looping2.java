/*Question 2: Write a java program to print all natural numbers in reverse (from n to 1). using a while loop.
Input:

n = 5

Output:

5 4 3 2 1

Explanation:

The program starts from n and decreases the number by 1 each time.
The loop runs until the number becomes 1.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping2{
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--){
             System.out.println(i);
        }
    }
}