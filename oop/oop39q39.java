/*Question 39: Write a Java program to implement Bank Account Management using Array of Objects.
Create a POJO class Account with attributes accountNumber and balance.
Store multiple accounts in array of objects.
Perform:
1. Count accounts with balance above 10000
2. Find minimum balance account
Input:
Enter number of accounts : 3

Account No : 101 Balance : 15000
Account No : 102 Balance : 7000
Account No : 103 Balance : 20000

Output:
Accounts above 10000 : 2
Minimum Balance Account : 102

Explanation:
Account acc[] = new Account[3] creates array. Each acc[i] = new Account().
Count above 10000: loop, if getBalance() > 10000 => count++.
15000 > 10000 (Account 101) and 20000 > 10000 (Account 103) => count = 2.
Minimum balance: compare all getBalance() values.
7000 < 15000 and 7000 < 20000 => Account 102 has minimum balance.
This program demonstrates filtering and minimum search in array of objects.

Asked In Companies:
Practice assignment*/

