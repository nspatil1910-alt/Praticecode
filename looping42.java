/*Question 42: Write a Java program to check whether a given number is a Kaprekar number or not, and to display all Kaprekar numbers up to n.
A Kaprekar number is a non-negative integer, the representation of whose square can be split into two parts that add up to the original number itself.
For example:
? 9² = 81 ? split as 8 and 1 ? 8 + 1 = 9
? 45² = 2025 ? split as 20 and 25 ? 20 + 25 = 45
Input:

Number = 45

Output:

Kaprekar Number

Explanation:

45² = 2025
Split as 20 and 25
20 + 25 = 45
So it is a Kaprekar number.

Input:

n = 50

Output:

1 9 45

Explanation:

These numbers satisfy the Kaprekar condition up to 50.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping42{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            if (isKaprekar(i)) {
                System.out.print(i + " ");
            }
       }

       static boolean isKaprekar(int n) {
        if (n == 1) return true;

        long sq = n * n;

        String s = String.valueOf(sq);

        for (int i = 1; i < s.length(); i++) {
            long left = Long.parseLong(s.substring(0, i));
            long right = Long.parseLong(s.substring(i));

            if (left + right == n) {
                return true;
            }
        }
        return false;
    }

}
}