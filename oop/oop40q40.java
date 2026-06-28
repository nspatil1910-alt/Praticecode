/* 
Question 40: Write a Java program to implement Hospital Patient Management using Array of Objects.
Create a POJO class Patient with attributes patientId, age, and billAmount.
Store N patients using array of objects.
Perform:
1. Count patients above age 60
2. Find patient with highest bill
Input:
Enter number of patients : 3

Patient Id : 1 Age : 65 Bill : 12000
Patient Id : 2 Age : 40 Bill : 9000
Patient Id : 3 Age : 72 Bill : 15000

Output:
Patients above age 60 : 2
Highest Bill Amount : 15000

Explanation:
Patient pat[] = new Patient[3] creates array. Each pat[i] = new Patient().
Count above 60: loop, if getAge() > 60 => count++.
Patient 1 (age 65) and Patient 3 (age 72) => count = 2.
Highest bill: compare getBillAmount() of all patients.
12000 vs 9000 vs 15000 => 15000 is highest (Patient 3).
This program demonstrates counting and max-finding in array of objects.

Asked In Companies:
Practice assignment

*/
import java.util.Scanner;

class Patient {
    private int patientId;
    private int age;
    private double billAmount;

    public Patient(int patientId, int age, double billAmount) {
        this.patientId = patientId;
        this.age = age;
        this.billAmount = billAmount;
    }

    public int getAge() {
        return age;
    }

    public double getBillAmount() {
        return billAmount;
    }
}

public class oop40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients : ");
        int n = sc.nextInt();

        Patient[] pat = new Patient[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Patient Id : ");
            int id = sc.nextInt();

            System.out.print("Age : ");
            int age = sc.nextInt();

            System.out.print("Bill : ");
            double bill = sc.nextDouble();

            pat[i] = new Patient(id, age, bill);
        }

        int count = 0;
        double maxBill = pat[0].getBillAmount();

        for (int i = 0; i < n; i++) {
            if (pat[i].getAge() > 60) {
                count++;
            }

            if (pat[i].getBillAmount() > maxBill) {
                maxBill = pat[i].getBillAmount();
            }
        }

        System.out.println("Patients above age 60 : " + count);
        System.out.println("Highest Bill Amount : " + maxBill);
    }
}

