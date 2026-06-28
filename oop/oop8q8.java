/*Question 8: Write a Java program to implement a Bank Balance Checker.
Create a class BankAccount with attributes accountNumber, name, and balance.
Check account status:
- balance >= 10000 => Premium Account
- balance 5000 to 9999 => Normal Account
- balance < 5000 => Low Balance Warning
Input:
Enter Account Number : 98765
Enter Name : Neha
Enter Balance : 4500

Output:
Account Number : 98765
Name : Neha
Balance : 4500
Status : Low Balance Warning

Explanation:
A class BankAccount is created with accountNumber, name, and balance.
The user inputs all three values via Scanner.
An if-else ladder determines the account status:
- balance >= 10000 => Premium Account
- balance >= 5000 && balance <= 9999 => Normal Account
- balance < 5000 => Low Balance Warning
Since 4500 < 5000, the status is Low Balance Warning.
This program models a real-world banking classification using class objects.

Asked In Companies:
Practice assignment*/

import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String name;
    int  balance;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Balance: ");
        balance = sc.nextInt();
    }

    void checkStatus() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);

        if (balance >= 10000) {
            System.out.println("Status: Premium Account");
        } else if (balance >= 5000 && balance <= 9999) {
            System.out.println("Status: Normal Account");
        } else {
            System.out.println("Status: Low Balance Warning");
        }
    }
}

public class oop8q8 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.inputDetails();
        acc.checkStatus();
        
    }
}