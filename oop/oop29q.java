/*Question 29: Write a Java program to implement a Bank Balance Validator using POJO class.
Create a POJO class Account with variables accountNumber and balance.
Using getter and setter methods:
- balance >= 10000 => Premium Account
- balance 5000 to 9999 => Normal Account
- balance < 5000 => Low Balance Warning
Input:
Enter Account Number : 87654
Enter Balance : 4200

Output:
Account Number : 87654
Balance : 4200
Status : Low Balance Warning

Explanation:
A POJO class Account has private fields: accountNumber and balance.
Setter methods accept user input. Getter methods are used in the logic block.
If-else ladder:
- balance >= 10000 => Premium Account
- balance >= 5000 && balance <= 9999 => Normal Account
- balance < 5000 => Low Balance Warning
Since 4200 < 5000, Status = Low Balance Warning.
This models a real banking classification system using POJO principles.

Asked In Companies:
Practice assignment*/



import java.util.Scanner;
class Account {
    private int accountNumber;
    private int balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }


    public String getStatus() {
        if (balance >= 10000) {
            return "Premium Account";
        } else if (balance >= 5000) {
            return "Normal Account";
        } else {
            return "Low Balance Warning";
        }
    }
}

public class oop29q{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account acc = new Account();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Balance: ");
        int bal = sc.nextInt();

        acc.setAccountNumber(accNo);
        acc.setBalance(bal);

        System.out.println("\nAccount Number : " + acc.getAccountNumber());
        System.out.println("Balance : " + acc.getBalance());
        System.out.println("Status : " + acc.getStatus());

        
    }
}