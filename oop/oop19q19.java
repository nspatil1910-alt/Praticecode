/*Question 19: Write a Java program to implement a Number Analyzer using Method Overloading.
Create a class NumberAnalyzer and overload method check():
- check(int num) => Check even or odd
- check(int num1, int num2) => Find the greater number
- check(int num1, int num2, int num3) => Find the smallest number
Input:
Enter number : 14
Enter two numbers : 20 15
Enter three numbers : 9 4 7

Output:
14 is Even
Greater Number : 20
Smallest Number : 4

Explanation:
check(14):
- 14 % 2 == 0 => Even. Prints: 14 is Even.
check(20, 15):
- Compares two values using if-else. 20 > 15 => Greater Number : 20.
check(9, 4, 7):
- Compares three values to find smallest.
- 4 < 9 and 4 < 7 => Smallest Number : 4.
Java distinguishes overloads by argument count.
This program combines arithmetic, comparison, and method overloading.

Asked In Companies:
Practice assignment*/
 
import java.util.Scanner;

class NumberAnalyzer {
    void check(int num){
        if(num%2==0) {
        System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
         void check(int num1,int num2){
            if(num1>num2){
               System.out.println("num1");
            }else{
                System.out.println("num2");
            }
        }
        void check(int num1, int num2 , int num3) {
        int smallest = num1;

        if (num2 > smallest) {
            smallest = num2;
        }
        if (num3 > smallest) {
            smallest = num3;
        }

        System.out.println("Smallest Number : " + smallest);
    } 
    }


public class oop19q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n1 = sc.nextInt();

        System.out.print("Enter Two Number : ");
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        System.out.print("Enter three Number");
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        int n6 = sc.nextInt();
         NumberAnalyzer obj = new  NumberAnalyzer();

        obj.check(n1);     
        obj.check(n2, n3);
        obj.check(n4,n5,n6);   

    
    }
}








