/*Question 5: Write a java program to print all odd numbers between 1 to 100.
Input:

No input required

Output:

1 3 5 7 ... 99

Explanation:

Odd numbers are not divisible by 2.
The program prints numbers where number % 2 is not equal to 0.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=99;i++){
            System.out.print(i%2);
        }

    }
}