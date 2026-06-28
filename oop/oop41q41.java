/* 
Question 41: Write a Java program to implement Library Book Management using Array of Objects.
Create a POJO class Book with attributes bookId, price, and copies.
Store books using array of objects.
Perform:
1. Find total number of book copies
2. Find book with lowest price
Input:
Enter number of books : 3

Book Id : 101 Price : 500 Copies : 3
Book Id : 102 Price : 350 Copies : 5
Book Id : 103 Price : 600 Copies : 2

Output:
Total Copies : 10
Lowest Price Book : 102

Explanation:
Book books[] = new Book[3] creates array. Each books[i] = new Book().
Total copies: loop, totalCopies += getCopies().
3 + 5 + 2 = 10 total copies.
Lowest price: compare getPrice() of all books.
500 vs 350 vs 600 => 350 is minimum => Book 102.
This teaches summation and minimum search in array of objects.

Asked In Companies:
Practice assignment

*/

import java.util.Scanner;

class Patient {
    private int bookId;
    private int price ;
    private int copies;

    public Patient(int bookId, int price, int copies) {
        this.bookId = bookId;
        this.price = price;
        this.copies = copies;
    }

    public int getprice() {
        return price;
    }

    public int  getcopies() {
        return copies;
    }
}

public class oop41q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of book copies : ");
        int n = sc.nextInt();

        Patient[] pat = new Patient[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Book Id : ");
            int id = sc.nextInt();

            System.out.print("Price : ");
            int price = sc.nextInt();

            System.out.print("Copies : ");
            int copies = sc.nextInt();

            pat[i] = new Patient(id, price, copies);
        }

         int totalCopies = 0;
        int minPrice = books[0].getPrice();
        int lowestPriceBookId = books[0].getBookId();

        for (int i = 0; i < n; i++) {
            totalCopies += books[i].getCopies();

            if (books[i].getPrice() < minPrice) {
                minPrice = books[i].getPrice();
                lowestPriceBookId = books[i].getBookId();
            }
        }

        System.out.println("Total Copies : " + totalCopies);
        System.out.println("Lowest Price Book : " + lowestPriceBookId);

    }
}
