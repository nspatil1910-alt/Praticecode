/*Question 36: Write a java program to find HCF (GCD) of two numbers.
Input:

Number1 = 12
Number2 = 18

Output:

HCF = 6

Explanation:

6 is the largest number that divides both 12 and 18 without remainder.
Therefore, HCF is 6.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping36{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.primtln("Enter a first number");
        int c = sc.nextInt();
        System.out.println("Enter a Second number");
        int d = sc.nextInt();

        int Hcf =1;
        int i =1;
        int min =(c<d)?c:d;
        while(i<=min){
            if(c%==0 && d%i==0){
                Hcf=i;
            }
        }
        System.out.println(" The Hcf is "+Hcf),
        
    }
}