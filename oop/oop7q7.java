/*Question 7: Write a Java program to implement an Electricity Bill Calculator.
Create a class ElectricityBill with attributes customerId, name, and units.
Calculate bill using slabs:
- First 100 units => Rs.5 per unit
- Next 100 units => Rs.7 per unit
- Above 200 units => Rs.10 per unit
Display total bill.
Input:
Enter Customer Id : 301
Enter Name : Suresh
Enter Units : 250

Output:
Customer Id : 301
Name : Suresh
Units : 250
Total Bill : Rs. 1850

Explanation:
A class ElectricityBill is created with customerId, name, and units.
Bill is calculated in slabs:
- First 100 units : 100 * 5 = 500
- Next 100 units : 100 * 7 = 700
- Remaining units : (250 - 200) = 50 units * 13 = 650
- Total Bill = 500 + 700 + 650 = 1850
The if-else conditions check: if units > 200, add slabs progressively.
This program demonstrates tiered calculation logic with class objects.

Asked In Companies:
Practice assignment*/

import java.util.Scanner;

class ElectricityBill {

    int cusId;
    String name;
    int units;
  double totalBill;

  public void calculateBill() {

        if (units <= 100) {
            totalBill = units * 5;
        } 
        else if (units <= 200) {
            totalBill = (100 * 5) + (units - 100) * 7;
        } 
        else {
            totalBill = (100 * 5) + (100 * 7) +(units - 200) * 10;
        }
    }
    

    public void display() {
        System.out.println("Customer Id : " + cusId);
        System.out.println("Name : " + name);
        System.out.println("Units : " + units);
        System.out.println("Total Bill: " + totalBill);
    }
}

public class oop7q7{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         ElectricityBill eb= new  ElectricityBill();

        System.out.print("Enter Customer Id : ");
        eb.cusId = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter Name : ");
        eb.name = sc.nextLine();

        System.out.print("Enter Units : ");
        eb.units = sc.nextInt();

        System.out.println();
        eb.calculateBill();
        eb.display();
    }
}