/*Question 22: Write a Java program to implement an Array Maximum Finder using Method Overloading.
Create a class ArrayMax and overload method max():
- max(int arr[]) => Find the largest element
- max(int arr[], int size) => Find the smallest element
Input:
Enter array elements : 12 7 45 20 33

Output:
Largest Number : 45
Smallest Number : 7

Explanation:
max(arr):
- Starts with arr[0] = 12 as initial maximum.
- Compares each element: 12, 7, 45, 20, 33.
- 45 is the largest. Prints Largest Number : 45.
max(arr, size):
- Starts with arr[0] = 12 as initial minimum.
- Compares each element: 12, 7, 45, 20, 33.
- 7 is the smallest. Prints Smallest Number : 7.
Despite similar names, each overload performs a distinct operation.
This demonstrates max/min search in arrays using method overloading.

Asked In Companies:
Practice assignment*/

import java.util.Scanner;

class Arraymax {
        void Max(int arr[]){
            int largest = arr[0];
            
            for(int i=1;i<arr.length;i++){
                if(arr[i]>largest){
                    largest=arr[i];
                }
            }
            System.out.println("Largest Array="+ largest);
        }
         
            void Min(int arr[]){
            int smallest = arr[0];
            
            for(int i=1;i<arr.length;i++){
                if(arr[i]<smallest){
                    smallest =arr[i];
                }
            }
            System.out.println("Smallest Array="+ smallest);
    }
        }
    
    

public class oop22q22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.print("Enter array elements : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayMax obj = new ArrayMax();

        obj.max(arr);              
        obj.max(arr, arr.length); 
    }
}