/*Question 31: Write a java program to display 1 to nth Duck Number.
Input:

n = 5

Output:

10 20 30 40 50

Explanation:

Duck numbers contain zero inside the number.
The first five Duck Numbers are 10, 20, 30, 40, and 50.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Duck Number");
        int n = sc.nextInt();
             int count =0;
             int num=10;

           while (count < n) {

            if (String.valueOf(num).contains("0")) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }
    }
}