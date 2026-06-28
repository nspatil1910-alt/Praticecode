/*Question 43: Write a Java program to check whether a given number is a Disarium number or not, and display all Disarium numbers up to n.
A Disarium number is a number whose sum of its digits powered with their respective positions is equal to the number itself.
Example: 135 is a Disarium number because 1¹ + 3² + 5³ = 1 + 9 + 125 = 135.
Explanation:
Use a loop to count digits. Use another loop to extract each digit and calculate the digit raised to its position power using only loops (no Math.pow()). Check if the sum equals the original number.
Input:
Number = 135

Output:
Disarium Number

Explanation:
1¹ + 3² + 5³ = 1 + 9 + 125 = 135
Since the sum equals the number, it is Disarium.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;

public class DisariumNumber{
    static int power(int base, int exp) {
        int result = 1;

        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }

        return result;
    }

    static boolean isDisarium(int num) {

        int temp = num;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        temp = num;
        int sum = 0;

        while (temp > 0) {

            int digit = temp % 10;

            sum = sum + power(digit, digits);

            digits--;

            temp = temp / 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

    
        if (isDisarium(num)) {
            System.out.println("Disarium Number");
        } else {
            System.out.println("Not a Disarium Number");
        }

        
        System.out.println("Disarium numbers up to " + num + " are:");

        for (int i = 1; i <= num; i++) {

            if (isDisarium(i)) {
                System.out.print(i + " ");
            }
        }
    }
}