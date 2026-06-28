/*Question 12: Write a Java program to implement a Mobile Recharge Plan Selector.
Create a class Recharge with attributes mobileNumber and planAmount.
Determine plan benefits:
- Plan 199 => 1GB/day
- Plan 399 => 2GB/day
- Plan 599 => 3GB/day
- Other => Invalid Plan
Input:
Enter Mobile Number : 9876543210
Enter Plan Amount : 399

Output:
Mobile Number : 9876543210
Plan : 399
Benefit : 2GB per day

Explanation:
A class Recharge is created with mobileNumber and planAmount.
User enters the mobile number and selects a recharge plan.
A switch-case or if-else block is used to match the plan:
- planAmount == 199 => 1GB per day
- planAmount == 399 => 2GB per day
- planAmount == 599 => 3GB per day
- default => Invalid Plan
Since planAmount = 399, the benefit is 2GB per day.
This program models a real telecom recharge system using class and conditional logic.

Asked In Companies:
Practice assignment*/

import java.util.Scanner;
 class  Recharge{
    long mobilenumber;
    int planamount;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mobile Number: ");
          mobilenumber= sc.nextLong();

        sc.nextLine();

        System.out.print("Enter Amount : ");
         planamount = sc.nextInt();
        
    }

    void showBenefits() {
    System.out.println("Mobile Number : " + mobilenumber);
    System.out.println("Plan Amount : " + planamount);

    checkPlan(); 
}

void checkPlan() {
    if (planamount == 199) {
        System.out.println("Status: 1GB per day");
    } else if (planamount == 399) {
        System.out.println("Status: 2GB per day");
    } else if (planamount == 599) {
        System.out.println("Status: 3GB per day");
    } else {
        System.out.println("Status: Invalid Plan");
    }
}
}


public class oop12q12 {
    public static void main(String[] args) {
     Recharge r  = new Recharge();
        r.inputDetails();
        r.showBenefits();
        
    }
}






