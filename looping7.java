/*Question 7: Write a java program to find the sum of all even numbers between 1 to n.
Input:

n = 10

Output:

Sum = 30

Explanation:

Even numbers between 1 and 10 are 2, 4, 6, 8, 10.
Their sum is 2 + 4 + 6 + 8 + 10 = 30.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter of n");
        int n=sc.nextInt();

        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum = sum +i;
            }
        }
        System.out.println(" sum of all even numbers between 1 to="+ n +" is "+sum);
        
    }
}