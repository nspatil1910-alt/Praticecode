/*Question 15: Write a Java program to implement a Parking Fee Calculator.
Create a class Parking with attributes vehicleNumber and hours.
Calculate parking fee:
- First 2 hours => Rs.20 per hour
- Remaining hours => Rs.30 per hour
Display total fee.
Input:
Enter Vehicle Number : MH12AB1234
Enter Hours : 5

Output:
Vehicle Number : MH12AB1234
Parking Hours : 5
Total Parking Fee : Rs. 130

Explanation:
A class Parking is created with vehicleNumber and hours.
The fee calculation uses a slab system:
- For the first 2 hours: 2 * 20 = 40
- Remaining hours: (5 - 2) = 3 hours * 30 = 90
- Total Fee = 40 + 90 = 130
Condition: if (hours > 2), charge Rs.30 per hour for extra time.
If hours = 2, total fee = 2 * 20 = 40 (no extra charge).
This program models a real parking system using class objects and tiered pricing.

Asked In Companies:
Practice assignment*/

import java.util.Scanner;

class Parking {
    String vehicleNumber;
    int hours;
    int calculateFee() {
        int fee;

        if (hours <= 2) {
            fee = hours * 20;
        } else {
            fee = (2 * 20) + ((hours - 2) * 30);
        }

        return fee;
    }
}

public class oop15q15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Parking p = new Parking();
        System.out.print("Enter Vehicle Number : ");
        p.vehicleNumber = sc.nextLine();

        System.out.print("Enter Hours : ");
        p.hours = sc.nextInt();

    
        int totalFee = p.calculateFee();


        System.out.println("\nVehicle Number : " + p.vehicleNumber);
        System.out.println("Parking Hours : " + p.hours);
        System.out.println("Total Parking Fee : Rs. " + totalFee);

        
    }
}