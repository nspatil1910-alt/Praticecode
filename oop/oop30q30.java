/*Question 30: Write a Java program to implement a Product Discount Calculator using POJO class.
Create a POJO class Product with variables productId, price, and quantity.
Using getter and setter methods:
- Calculate total amount = price * quantity
- If total > 5000 => 10% discount
- Otherwise => No discount
Display final amount.
Input:
Enter Product Id : 101
Enter Price : 1200
Enter Quantity : 5

Output:
Product Id : 101
Total Amount : 6000
Discount : 600
Final Amount : 5400

Explanation:
A POJO class Product has private fields: productId, price, quantity.
Total Amount = price * quantity = 1200 * 5 = 6000.
Condition: if (totalAmount > 5000) => 10% discount.
Discount = 6000 * 10 / 100 = 600.
Final Amount = 6000 - 600 = 5400.
Setters store values entered by user. Getters retrieve them for calculation.
This demonstrates POJO encapsulation combined with business discount logic.

Asked In Companies:
Practice assignment*/

import java.util.Scanner;
  public class product {
    private int productId;
    private int price;
    private int quantity;

  public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
public class oop30q30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product p = new Product();

        
        System.out.print("Enter Product Id : ");
        p.setProductId(sc.nextInt());

        System.out.print("Enter Price : ");
        p.setPrice(sc.nextDouble());

        System.out.print("Enter Quantity : ");
        p.setQuantity(sc.nextInt());

       
        double totalAmount = p.getPrice() * p.getQuantity();
        double discount = 0;

        if (totalAmount > 5000) {
            discount = totalAmount * 10 / 100;
        }

        double finalAmount = totalAmount - discount;

        
        System.out.println("\nProduct Id : " + p.getProductId());
        System.out.println("Total Amount : " + totalAmount);
        System.out.println("Discount : " + discount);
        System.out.println("Final Amount : " + finalAmount);

        
    }
}