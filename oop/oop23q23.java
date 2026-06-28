/*Question 23: Write a Java program to implement an Array Number Counter using Method Overloading.
Create a class ArrayCount and overload method count():
- count(int arr[]) => Count even numbers in array
- count(int arr[], int size) => Count odd numbers in array
Input:
Enter array elements : 5 8 12 7 9 4

Output:
Even Numbers : 3
Odd Numbers : 3

Explanation:
count(arr):
- Iterates array. For each element: if (num % 2 == 0) => increment even counter.
- Even numbers: 8, 12, 4 => count = 3.
count(arr, size):
- For each element: if (num % 2 != 0) => increment odd counter.
- Odd numbers: 5, 7, 9 => count = 3.
Both methods loop through the same array but apply different conditions.
This program teaches filtering/counting in arrays using method overloading.

Asked In Companies:
Practice assignment*/

import java.util.Scanner;

class ArrayCount 
{

    void count(int arr[])
    {
        int even = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                even++;
            }
        }

        System.out.println("Even Numbers : " + even);
    }

    
    void count(int arr[], int size)
    {
        int odd = 0;

        for(int i = 0; i < size; i++)
        {
            if(arr[i] % 2 != 0)
            {
                odd++;
            }
        }

        System.out.println("Odd Numbers : " + odd);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[6];

        System.out.println("Enter array elements : ");

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        ArrayCount obj = new ArrayCount();

        obj.count(arr);             
        obj.count(arr, arr.length); 
    }
}