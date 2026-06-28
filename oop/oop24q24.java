/*Question 24: Write a Java program to implement Array Comparison using Method Overloading.
Create a class ArrayCompare and overload method compare():
- compare(int arr1[], int arr2[]) => Find sum of both arrays
- compare(int arr1[], int arr2[], int size) => Find difference of sums
Input:
Array1 : 10 20 30
Array2 : 5 15 25

Output:
Sum of Array1 : 60
Sum of Array2 : 45
Difference : 15

Explanation:
compare(arr1, arr2):
- Calculates sum of each array separately.
- Sum of Array1 = 10 + 20 + 30 = 60.
- Sum of Array2 = 5 + 15 + 25 = 45.
- Prints both sums.
compare(arr1, arr2, size):
- Calculates difference of sums: 60 - 45 = 15.
- The extra parameter 'size' differentiates this overload.
This program demonstrates working with multiple arrays and method overloading.

Asked In Companies:
Practice assignment*/

import java.util.Scanner;
 public class oop24q24{
    void compare(int arr1[], int arr2[], int size) {
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < size; i++) {
            sum1 += arr1[i];
            sum2 += arr2[i];
        }

        int diff = sum1 - sum2;

        System.out.println("Difference : " + diff);
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr1[] = new int[3];
        int arr2[] = new int[3];

        System.out.println("Enter Array1 elements:");
        for (int i = 0; i < 3; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter Array2 elements:");
        for (int i = 0; i < 3; i++) {
            arr2[i] = sc.nextInt();
        }

        ArrayCompare obj = new ArrayCompare();

        obj.compare(arr1, arr2);    

        obj.compare(arr1, arr2, 3);   
    }


