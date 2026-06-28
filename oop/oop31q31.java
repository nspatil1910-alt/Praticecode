/*Question 31: Write a Java program to implement an Electricity Bill Generator using POJO class.
Create a POJO class Electricity with variables customerId and units.
Calculate bill using slabs:
- First 100 units => Rs.5 per unit
- Next 100 units => Rs.7 per unit
- Above 200 units => Rs.10 per unit
Input:
Enter Customer Id : 501
Enter Units : 250

Output:
Customer Id : 501
Units : 250
Total Bill : Rs. 1850

Explanation:
A POJO class Electricity has private fields: customerId and units.
Setter methods store user input. Getter methods retrieve units for calculation.
Slab-based bill calculation:
- First 100 units : 100 * 5 = 500
- Next 100 units : 100 * 7 = 700
- Remaining units : (250 - 200) = 50 units * 13 = 650
- Total Bill = 500 + 700 + 650 = 1850
If-else conditions check if units > 200, units > 100 to apply slabs.
This program shows POJO with real-world tiered billing logic.

Asked In Companies:
Practice assignment*/
import java.util.Scanner;

class ElectricityBill {

    int cusId;
    String name;
    int units;
  double totalBill;

  public void calculateBill() {

        if (units <= 1000) {
            totalBill = units * 5;
        } 
        else if (units <= 200) {
            totalBill = (100 * 5) + (units - 100) * 7;
        } 
        else {
            totalBill = (100 * 5) + (100 * 7) +(units - 200) * 13;
        }
    }
    

    public void display() {
        System.out.println("Customer Id : " + cusId);
        System.out.println("Units : " + units);
        System.out.println("Total Bill: " + totalBill);
    }
}

public class oop31q31{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         ElectricityBill eb= new  ElectricityBill();

        System.out.print("Enter Customer Id : ");
        eb.cusId = sc.nextInt();

        sc.nextLine(); 

        

        System.out.print("Enter Units : ");
        eb.units = sc.nextInt();

        System.out.println();
        eb.calculateBill();
        eb.display();
    }
}