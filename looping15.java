/*Question 15: Write a java program to print all ASCII characters with their values.
Input:

No input required

Output (Sample):

A = 65
B = 66
...

Explanation:

The program uses a loop from 0 to 127.
Each number is converted to its corresponding character and printed.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" print all ASCII characters with their values");
          for(int i=43;i<=127;i++){
            System.out.println(" "+(char)i);
          }
          sc.close();
    }
}