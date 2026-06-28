/*Question 17: Write a java program to find all factors of a number.
Input:

Number = 12

Output:

Factors: 1 2 3 4 6 12

Explanation:

A factor divides the number completely without remainder.
All numbers that divide 12 exactly are printed.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Factors of " + n + " are:");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }

    }
}
}