/*Question 35: Write a Java program to implement a Number Range Analyzer using POJO class.
Create a POJO class RangeCheck with variable number.
Using getter and setter methods, determine:
- number < 0 => Negative
- number 0 to 100 => Normal Range
- number > 100 => Large Number
Input:
Enter Number : 135

Output:
Number : 135
Category : Large Number

Explanation:
A POJO class RangeCheck has private field: number.
setNumber(135) stores the value. getNumber() retrieves it for checking.
If-else ladder:
- number < 0 => Negative
- number >= 0 && number <= 100 => Normal Range
- number > 100 => Large Number
Since 135 > 100, Category = Large Number.
If number = -5, output would be Negative.
If number = 50, output would be Normal Range.
This demonstrates range checking logic using POJO encapsulation.

Asked In Companies:
Practice assignment*/

import java.util.Scanner;
    
class Range {
    private int number;
    private int category;

    public void setNumber(int Number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getCategory() {
        return category;
    }


    public String getStatus() {
        if (number < 0 ) {
            return "Category = Negative";
        } else if (number >= 0 && number <= 100) {
            return "Category = Normal Range";
        } else {
            return "Category = Large Number";
        }
    }
}

public class oop35q35{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Range ra = new Range();

        System.out.print("Enter  Number: ");
        int number= sc.nextInt();

        ra.setNumber(number);
        

        System.out.println("\nnumber : " + ra.getnumber());
        
        System.out.println(ra.getStatus());
    }
}