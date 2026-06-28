/*
Question 50: Write a Java program to implement Library Book Management using Menu-Driven approach.
Create a POJO class Book with attributes bookId, price, and copies.
Store books using array of objects.
Menu Operations:
1. Add Book
2. Display Books
3. Find Book with Highest Price
4. Calculate Total Copies
5. Exit
Input / Output Example:

Enter Choice : 1
Enter Book Id : 101
Enter Price : 500
Enter Copies : 3
Output : Book Added Successfully

Enter Choice : 4
Output : Total Copies : 20

Enter Choice : 3
Output : Highest Price Book : 103

Enter Choice : 5
Output : Exiting...

Explanation:
The menu-driven program runs inside while(true) loop with switch-case.
Option 1 - Add: creates Book object, stores bookId, price, copies via setters. count++.
Option 2 - Display: prints all books from index 0 to count-1.
Option 3 - Highest Price: comparison loop finds book with maximum getPrice().
Option 4 - Total Copies: loop sums all getCopies() values.
Option 5 - Exit: breaks while loop.
This demonstrates complete library management using POJO, array of objects, and menu-driven approach.

Asked In Companies: 
Practice assignment*/

iimport java.util.Scanner;

class Book {
    private int bookId;
    private double price;
    private int copies;

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    
    public int getBookId() {
        return bookId;
    }

    public double getPrice() {
        return price;
    }

    public int getCopies() {
        return copies;
    }
}

public class oop50q50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book books[] = new Book[100];
        int count = 0;

        while (true) {
            System.out.println("\n1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Find Book with Highest Price");
            System.out.println("4. Calculate Total Copies");
            System.out.println("5. Exit");

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    books[count] = new Book();

                    System.out.print("Enter Book Id : ");
                    books[count].setBookId(sc.nextInt());

                    System.out.print("Enter Price : ");
                    books[count].setPrice(sc.nextDouble());

                    System.out.print("Enter Copies : ");
                    books[count].setCopies(sc.nextInt());

                    count++;
                    System.out.println("Book Added Successfully");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Books Available");
                    } else {
                        System.out.println("Book Details:");
                        for (int i = 0; i < count; i++) {
                            System.out.println(
                                books[i].getBookId() + "  " +
                                books[i].getPrice() + "  " +
                                books[i].getCopies()
                            );
                        }
                    }
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("No Books Available");
                    } else {
                        int index = 0;

                        for (int i = 1; i < count; i++) {
                            if (books[i].getPrice() > books[index].getPrice()) {
                                index = i;
                            }
                        }

                        System.out.println("Highest Price Book : "
                                + books[index].getBookId());
                    }
                    break;

                case 4:
                    int totalCopies = 0;

                    for (int i = 0; i < count; i++) {
                        totalCopies += books[i].getCopies();
                    }

                    System.out.println("Total Copies : " + totalCopies);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}