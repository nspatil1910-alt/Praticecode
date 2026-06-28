/*Question 33: Write a java program to display 1 to nth Armstrong Number
Input:

n = 4

Output:

0 1 153 370

Explanation:

0 and 1 are Armstrong Numbers.
153 and 370 are Armstrong Numbers because the sum of cubes of their digits equals the num

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping33{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Amstrong Number");
        int n = sc.nextInt();
       int num = 153;
      int temp = num;
        int sum = 0;

while(temp != 0)
{
    int rem = temp % 10;
    sum = sum + (rem * rem * rem);

    temp = temp / 10;
}

if(num == sum)
{
    System.out.println("It is Armstrong Number");
}
else
{
    System.out.println("It is Not Armstrong Number");
}
    }
}


    