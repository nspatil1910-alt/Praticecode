/* 
Question 43: Write a Java program to implement Sales Management System using Array of Objects.
Create a POJO class Sales with attributes salesId and salesAmount.
Store sales data in array of objects.
Perform:
1. Calculate total sales
2. Find average sales amount
Input:
Enter number of sales : 3

Sales Id : 1 Amount : 5000
Sales Id : 2 Amount : 7000
Sales Id : 3 Amount : 3000

Output:
Total Sales : 15000
Average Sales : 5000

Explanation:
Sales sal[] = new Sales[3] creates array. Each sal[i] = new Sales().
Total Sales: loop, totalSales += getSalesAmount().
5000 + 7000 + 3000 = 15000.
Average Sales = Total Sales / count = 15000 / 3 = 5000.
Average is always calculated after the total loop completes.
This program teaches summation and average calculation in array of objects.

Asked In Companies:
Practice assignment

*/
import java.util.Scanner;

class Sales {
    private int salesId;
    private double salesAmount;


    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    
    public int getSalesId() {
        return salesId;
    }

    public double getSalesAmount() {
        return salesAmount;
    }
}

public class oop43q43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sales : ");
        int n = sc.nextInt();

        Sales[] sal = new Sales[n];

        double totalSales = 0;

    
        for (int i = 0; i < n; i++) {
            sal[i] = new Sales();

            System.out.print("Enter Sales Id : ");
            sal[i].setSalesId(sc.nextInt());

            System.out.print("Enter Sales Amount : ");
            sal[i].setSalesAmount(sc.nextDouble());

            totalSales += sal[i].getSalesAmount();
        }

        double averageSales = totalSales / n;

        System.out.println("\nTotal Sales : " + totalSales);
        System.out.println("Average Sales : " + averageSales);

    
    }
}
