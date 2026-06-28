/*Question 34: Write a Java program to implement a Parking Fee Calculator using POJO class.
Create a POJO class Parking with variables vehicleNumber and hours.
Calculate parking fee:
- First 2 hours => Rs.20 per hour
- Remaining hours => Rs.30 per hour
Input:
Enter Vehicle Number : 1234
Enter Hours : 5

Output:
Vehicle Number : 1234
Parking Fee : Rs. 130

Explanation:
A POJO class Parking has private fields: vehicleNumber and hours.
Setter methods store user input. Getter methods retrieve hours for fee calculation.
Fee logic:
- First 2 hours: 2 * 20 = 40
- Remaining: (5 - 2) = 3 hours * 30 = 90
- Total Fee = 40 + 90 = 130
Condition: if (hours > 2) add (hours - 2) * 30 to the base fee of 40.
If hours = 2, total = 40. If hours = 1, total = 1 * 20 = 20.
This demonstrates POJO with tiered fee calculation logic.

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

public class oop34q34{
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