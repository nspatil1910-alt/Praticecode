/*Question 6: Write a java program to find the sum of all natural numbers between 1 to n.
Input:

n = 5

Output:

Sum = 15

Explanation:

The program adds numbers from 1 to 5.
1 + 2 + 3 + 4 + 5 = 15.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
           int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
            System.out.println("Sum ="+sum);
        }
    }
}