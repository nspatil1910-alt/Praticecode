/*Question 8: Write a java program to find the sum of all odd numbers between
Input:

n = 10

Output:

Sum = 25

Explanation:

Odd numbers between 1 and 10 are 1, 3, 5, 7, 9.
Their sum is 1 + 3 + 5 + 7 + 9 = 25.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter of n");
        int n=sc.nextInt();

        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum = sum +i;
            }
        }
        System.out.println(" sum of all odd numbers between 1 to="+ n +" is "+sum);
    }
}