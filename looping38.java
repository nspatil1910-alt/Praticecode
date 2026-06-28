/*Question 38: Write a java program to find all prime factors of a number.
Input:

Number = 20

Output:

Prime Factors: 2 2 5

Explanation:

20 = 2 × 2 × 5
All these factors are prime numbers.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping38{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Prime Number");
        int num = sc.nextInt();

        /*logic */

        for(;num%2==0;num=num/2){
           System.out.print(2+" ");
        }
        for (int i = 3; i <= num; i = i + 2) {
            for (; num % i == 0; num = num / i) {
                System.out.print(i + " ");
            }
        }

    }
}