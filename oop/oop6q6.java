/*Question 6: Write a Java program to store 5 numbers in an array using constructor and find maximum number.

Description: Create NumberArray class having an integer array. Initialize array using constructor. Find maximum number using logic.
INPUT:
Enter 5 numbers: 10 45 22 89 34

OUTPUT:
Maximum number is: 89

EXPLANATION:
Create NumberArray class with int[] array field. Use constructor public NumberArray(int[] nums) to initialize array. Create method findMax() to find maximum using loop. Compare each element and store maximum. Display maximum value.

Asked In Companies:
Practice Assignment*/

import java.util.Scanner;

class NumberArray {
    int[] arr;

    public NumberArray(int[] nums) {
        arr = nums;
    }

    public int findMax() {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}

public class oop6q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
 
        NumberArray obj = new NumberArray(numbers);
        System.out.println("Maximum number is: " + obj.findMax());

    
    }
}
