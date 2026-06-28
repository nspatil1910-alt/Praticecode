/*Question 38: Write a Java program to implement Product Inventory Management using Array of Objects.
Create a POJO class Product with attributes productId, price, and quantity.
Store product info in array of objects.
Perform:
1. Calculate total inventory value (price * quantity)
2. Find product with maximum price
Input:
Enter number of products : 2

Product Id : 101
Price : 500
Quantity : 4

Product Id : 102
Price : 800
Quantity : 2

Output:
Total Inventory Value : 3600
Highest Price Product : 102

Explanation:
Product prod[] = new Product[2] creates array. Each prod[i] = new Product().
Total Inventory Value = sum of (price * quantity) for all products.
Product 101: 500 * 4 = 2000
Product 102: 800 * 2 = 1600
Total = 2000 + 1600 = 3600.
Highest price: compare getPrice() of all products.
500 vs 800 => Product 102 has the highest price.
This program demonstrates aggregate calculations over array of objects.

Asked In Companies:
Practice assignment*/

import java.util.Scanner;
class product {
    private int prodId;
    private int price;
    private int quantity;

    
    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    public int getProdId() {
        return prodId;
    }

    public int getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }
}

public class oop36q36{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees : ");
        int n = sc.nextInt();
        sc.nextLine();

       Product p[] = new Product[n];

        
        for (int i = 0; i < n; i++) {
            p[i] = new Product();

            System.out.println("\nEnter Product " + (i + 1) + " Details");

            System.out.print("Enter Product Id : ");
            p[i].setProdId(sc.nextInt());
            sc.nextLine();

            System.out.print("Enter Price: ");
            p[i].setPrice(sc.nextInt());

            System.out.print("Enter Quantity : ");
            p[i].setquantity(sc.nextI());
        }

    
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Emp Id : " + emp[i].getEmpId() +" Name : " + emp[i].getEmpName() +  " Salary : " + emp[i].getSalary());
        }

        
        Employee highest = emp[0];
        Employee lowest = emp[0];

        for (int i = 1; i < n; i++) {
            if (emp[i].getSalary() > highest.getSalary()) {
                highest = emp[i];
            }

            if (emp[i].getSalary() < lowest.getSalary()) {
                lowest = emp[i];
            }
        }

        System.out.println("\nHighest Salary Employee : "+ highest.getEmpName() + " - " + highest.getSalary());

        System.out.println("Lowest Salary Employee : "+ lowest.getEmpName() + " - "+ lowest.getSalary());

        
    }
}