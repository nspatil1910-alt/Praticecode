/*Question 25: Write a Java program to implement Number Series Operation using Method Overloading.
Create a class SeriesOperation and overload method process():
- process(int arr[]) => Find sum of all elements
- process(int arr[], int size) => Find product of all elements
Input:
Enter array elements : 2 3 4 5

Output:
Sum : 14
Product : 120

Explanation:
process(arr):
- Adds all array elements: 2 + 3 + 4 + 5 = 14. Prints Sum : 14.
process(arr, size):
- Multiplies all array elements.
- Initialize product = 1 (not 0, as multiplying by 0 gives 0).
- 1 * 2 * 3 * 4 * 5 = 120. Prints Product : 120.
Both methods use a for loop to traverse the array.
Sum uses += and Product uses *= operator.
This program teaches two different aggregate operations using method overloading.

Asked In Companies:
Practice assignment*/

import java.util.Scanner;
  class SeriesOperation{
    void process(int arr[]) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum1 += arr1[i];
        }
        
        System.out.println("Sum : " + sum);
}
}
 void process(int arr[], int size) {
        int product = 1;

        for (int i = 0; i < size; i++) {
            product *= arr[i];
        }

        System.out.println("Product : " + product);
    }


public class  oop25q25{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[4];

        System.out.print("Enter array elements : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        SeriesOperation obj = new SeriesOperation();

        obj.process(arr);              
        obj.process(arr, arr.length); 
    }
}