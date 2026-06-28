/*
Question 48: Write a Java program to implement Product Inventory Management using Menu-Driven approach.
Create a POJO class Product with attributes productId, price, and quantity.
Store products using array of objects.
Menu Operations:
1. Add Product
2. Display Products
3. Calculate Total Inventory Value (price * quantity)
4. Find Product with Maximum Price
5. Exit
Input / Output Example:

Enter Choice : 1
Enter Product Id : 201
Enter Price : 800
Enter Quantity : 5
Output : Product Added Successfully

Enter Choice : 3
Output : Total Inventory Value : 54000

Enter Choice : 4
Output : Maximum Price Product : 203

Enter Choice : 5
Output : Exiting...

Explanation:
The menu program uses while(true) loop with switch-case.
Option 1 - Add: creates Product object with productId, price, quantity. count++.
Option 2 - Display: prints all products from index 0 to count-1.
Option 3 - Total Inventory Value: loops through array, total += getPrice() * getQuantity().
Option 4 - Maximum Price: comparison loop finds product with highest getPrice().
Option 5 - Exit: terminates program.
This demonstrates POJO + array of objects + menu-driven design together.

Asked In Companies:
Practice assignment
 */


import java.util.Scanner;

class Product {
    private int productId;
    private int price;
    private int quantity;

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}

public class oop48q48 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product[] products = new Product[100];
        int count = 0;

        while (true) {

            System.out.println("\n----- Product Inventory Management -----");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Calculate Total Inventory Value");
            System.out.println("4. Find Product with Maximum Price");
            System.out.println("5. Exit");

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    Product p = new Product();

                    System.out.print("Enter Product Id : ");
                    p.setProductId(sc.nextInt());

                    System.out.print("Enter Price : ");
                    p.setPrice(sc.nextInt());

                    System.out.print("Enter Quantity : ");
                    p.setQuantity(sc.nextInt());

                    products[count] = p;
                    count++;

                    System.out.println("Product Added Successfully");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Products Available");
                    } else {
                        System.out.println("\nId\tPrice\tQuantity");

                        for (int i = 0; i < count; i++) {
                            System.out.println(
                                    products[i].getProductId() + "\t" +
                                    products[i].getPrice() + "\t" +
                                    products[i].getQuantity());
                        }
                    }
                    break;

                case 3:
                    int totalValue = 0;

                    for (int i = 0; i < count; i++) {
                        totalValue += products[i].getPrice() *
                                      products[i].getQuantity();
                    }

                    System.out.println("Total Inventory Value : " + totalValue);
                    break;

                case 4:
                    if (count == 0) {
                        System.out.println("No Products Available");
                    } else {

                        Product maxProduct = products[0];

                        for (int i = 1; i < count; i++) {
                            if (products[i].getPrice() >
                                maxProduct.getPrice()) {
                                maxProduct = products[i];
                            }
                        }

                        System.out.println(
                                "Maximum Price Product : " +
                                maxProduct.getProductId());
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
