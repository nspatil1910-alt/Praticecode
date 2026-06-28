/*Question 9: Write a java program to print a multiplication table of any number.
Input:

Number = 5

Output:

5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
...
5 x 10 = 50

Explanation:

The program multiplies the given number by values from 1 to 10.
Each result is printed in table format.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter of Number");
        int num = sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
       System.out.println("Multiplication Table of " + num + " is:");
}
}