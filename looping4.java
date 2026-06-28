/*Question 4: Write a java program to print all even numbers between 1 to 100.- using while loop
Input:

No input required

Output:

2 4 6 8 ... 100

Explanation:

Even numbers are divisible by 2.
The program checks each number from 1 to 100 and prints it if it is divisible by 2.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=2;i<=100;i++){
            System.out.print(i);
        }
    }
}