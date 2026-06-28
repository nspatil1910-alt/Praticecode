/* 
Question 45: Write a Java program to implement Transport Management System using Array of Objects.
Create a POJO class Vehicle with attributes vehicleId, distance, and fuelUsed.
Store vehicle records using array of objects.
Perform:
1. Calculate fuel efficiency (Efficiency = distance / fuelUsed)
2. Find vehicle with best efficiency
Input:
Enter number of vehicles : 2

Vehicle Id : 101 Distance : 300 Fuel Used : 20
Vehicle Id : 102 Distance : 250 Fuel Used : 10

Output:
Vehicle 101 Efficiency : 15.0
Vehicle 102 Efficiency : 25.0
Best Efficiency Vehicle : 102

Explanation:
Vehicle veh[] = new Vehicle[2] creates array. Each veh[i] = new Vehicle().
Efficiency = distance / fuelUsed (use double for decimal results).
Vehicle 101: 300 / 20 = 15.0
Vehicle 102: 250 / 10 = 25.0
Best efficiency: 25.0 > 15.0 => Vehicle 102 has best fuel efficiency.
All efficiencies are printed first, then the best one is displayed.
This models a transport fleet management system using array of objects.

Asked In Companies:
Practice assignment

*/
import java.util.Scanner;

class Vehicle {
    int vehicleId;
    double distance;
    double fuelUsed;

    public Vehicle(int vehicleId, double distance, double fuelUsed) {
        this.vehicleId = vehicleId;
        this.distance = distance;
        this.fuelUsed = fuelUsed;
    }

    public double getEfficiency() {
        return distance / fuelUsed;
    }
}

public class oop45q45{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vehicles : ");
        int n = sc.nextInt();

        Vehicle veh[] = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\n Vehicle Id : ");
            int id = sc.nextInt();

            System.out.print("Distance : ");
            double distance = sc.nextDouble();

            System.out.print("Fuel Used : ");
            double fuelUsed = sc.nextDouble();

            veh[i] = new Vehicle(id, distance, fuelUsed);
        }

        double maxEfficiency = veh[0].getEfficiency();
        int bestVehicleId = veh[0].vehicleId;

        System.out.println();

        for (int i = 0; i < n; i++) {
            double efficiency = veh[i].getEfficiency();

            System.out.println("Vehicle " + veh[i].vehicleId +
                               " Efficiency : " + efficiency);

            if (efficiency > maxEfficiency) {
                maxEfficiency = efficiency;
                bestVehicleId = veh[i].vehicleId;
            }
        }

        System.out.println("Best Efficiency Vehicle : " + bestVehicleId);

        
    }
}