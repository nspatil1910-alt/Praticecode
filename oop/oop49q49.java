/*
Question 49: Write a Java program to implement Bank Account Management System using Menu-Driven approach.
Create a POJO class Account with attributes accountNumber and balance.
Store accounts using array of objects.
Menu Operations:
1. Add Account
2. Display Accounts
3. Deposit Money
4. Withdraw Money
5. Find Minimum Balance Account
6. Exit
Input / Output Example:

Enter Choice : 1
Enter Account Number : 101
Enter Balance : 10000
Output : Account Added Successfully

Enter Choice : 3
Enter Account Number : 101
Enter Deposit Amount : 5000
Output :
Money Deposited Successfully
New Balance : 15000

Enter Choice : 4
Enter Account Number : 101
Enter Withdraw Amount : 3000
Output :
Money Withdrawn Successfully
New Balance : 12000

Enter Choice : 5
 */



import java.util.Scanner;

class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Money Withdrawn Successfully");
            System.out.println("New Balance : " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void display() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance);
    }
}

public class oop49q49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account[] accounts = new Account[100];
        int count = 0;
        int choice;

        do {
            System.out.println("\n1. Add Account");
            System.out.println("2. Display Accounts");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Find Minimum Balance Account");
            System.out.println("6. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Number : ");
                    int accNo = sc.nextInt();

                    System.out.print("Enter Balance : ");
                    double bal = sc.nextDouble();

                    accounts[count++] = new Account(accNo, bal);

                    System.out.println("Account Added Successfully");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Accounts Found");
                    } else {
                        for (int i = 0; i < count; i++) {
                            accounts[i].display();
                            System.out.println("----------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number : ");
                    accNo = sc.nextInt();

                    System.out.print("Enter Deposit Amount : ");
                    double dep = sc.nextDouble();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (accounts[i].getAccountNumber() == accNo) {
                            accounts[i].deposit(dep);
                            System.out.println("Money Deposited Successfully");
                            System.out.println("New Balance : " + accounts[i].getBalance());
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Account Not Found");
                    break;

                case 4:
                    System.out.print("Enter Account Number : ");
                    accNo = sc.nextInt();

                    System.out.print("Enter Withdraw Amount : ");
                    double wd = sc.nextDouble();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (accounts[i].getAccountNumber() == accNo) {
                            accounts[i].withdraw(wd);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Account Not Found");
                    break;

                case 5:
                    if (count == 0) {
                        System.out.println("No Accounts Available");
                    } else {
                        Account min = accounts[0];

                        for (int i = 1; i < count; i++) {
                            if (accounts[i].getBalance() < min.getBalance()) {
                                min = accounts[i];
                            }
                        }

                        System.out.println("Minimum Balance Account");
                        min.display();
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);

    
    }
}

