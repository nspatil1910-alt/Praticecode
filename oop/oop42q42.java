/*
Question 42: Write a Java program to implement Hotel Room Management using Array of Objects.
Create a POJO class Room with attributes roomNumber, pricePerDay, and daysStayed.
Store room records in array of objects.
Perform:
1. Calculate total bill for each room (Bill = pricePerDay * daysStayed)
2. Find room with highest bill
Input:
Enter number of rooms : 2

Room Number : 101 Price Per Day : 1500 Days Stayed : 3
Room Number : 102 Price Per Day : 2000 Days Stayed : 2

Output:
Room 101 Bill : 4500
Room 102 Bill : 4000
Highest Bill Room : 101

Explanation:
Room rooms[] = new Room[2] creates array. Each rooms[i] = new Room().
Bill for each room = pricePerDay * daysStayed.
Room 101: 1500 * 3 = 4500
Room 102: 2000 * 2 = 4000
Highest bill: 4500 > 4000 => Room 101 has highest bill.
Both bills are printed first, then the room with the highest bill is displayed.
This models a hotel billing system using array of objects.

Asked In Companies:
Practice assignment

*/

import java.util.Scanner;

class Room {
    private int roomNumber;
    private double pricePerDay;
    private int daysStayed;

    public Room(int roomNumber, double pricePerDay, int daysStayed) {
        this.roomNumber = roomNumber;
        this.pricePerDay = pricePerDay;
        this.daysStayed = daysStayed;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getBill() {
        return pricePerDay * daysStayed;
    }
}

public class oop42q42. {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rooms : ");
        int n = sc.nextInt();

        Room[] rooms = new Room[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Room Number : ");
            int roomNumber = sc.nextInt();

            System.out.print("Price Per Day : ");
            double pricePerDay = sc.nextDouble();

            System.out.print("Days Stayed : ");
            int daysStayed = sc.nextInt();

            rooms[i] = new Room(roomNumber, pricePerDay, daysStayed);
        }

        double maxBill = rooms[0].getBill();
        int highestBillRoom = rooms[0].getRoomNumber();

        for (int i = 0; i < n; i++) {
            double bill = rooms[i].getBill();

            System.out.println("Room " + rooms[i].getRoomNumber() +
                               " Bill : " + bill);

            if (bill > maxBill) {
                maxBill = bill;
                highestBillRoom = rooms[i].getRoomNumber();
            }
        }

        System.out.println("Highest Bill Room : " + highestBillRoom);

        
    }
}