/*Question 14: Write a Java program to implement an Online Order Billing System.
Create a class Order with attributes orderId, productPrice, and quantity.
Calculate:
- Total amount = productPrice * quantity
- If total > 5000 => 15% discount
- Otherwise => No discount
Display final amount after discount.
Input:
Enter Order Id : 1001
Enter Product Price : 1200
Enter Quantity : 5

Output:
Order Id : 1001
Total Amount : 6000
Discount : 900
Final Amount : 5100

Explanation:
A class Order is created with orderId, productPrice, and quantity.
Total Amount = productPrice * quantity = 1200 * 5 = 6000.
Since Total Amount (6000) > 5000, a 15% discount is applied:
Discount = 6000 * 15 / 100 = 900
Final Amount = 6000 - 900 = 5100.
If total were 4000 (< 5000), no discount would be applied.
This program demonstrates multiplication, conditional discount, and subtraction using class objects.

Asked In Companies:
Practice assignment*/

import java.util.Scanner;

class Order {
    int orderId;
    int productPrice;
    int quantity;

    void calculateBill() {
        int totalAmount = productPrice * quantity;
        int discount = 0;

        if (totalAmount > 5000) {
            discount = totalAmount * 15 / 100;
        }

        int finalAmount = totalAmount - discount;

        System.out.println("\n--- Order Details ---");
        System.out.println("Order Id : " + orderId);
        System.out.println("Total Amount : " + totalAmount);
        System.out.println("Discount : " + discount);
        System.out.println("Final Amount : " + finalAmount);
    }
}

public class oop14q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Order o = new Order();

        System.out.print("Enter Order Id : ");
        o.orderId = sc.nextInt();

        System.out.print("Enter Product Price : ");
        o.productPrice = sc.nextInt();

        System.out.print("Enter Quantity : ");
        o.quantity = sc.nextInt();

        o.calculateBill();

        
    }
}