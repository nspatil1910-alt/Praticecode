/*Question 17: Write a Java program to implement an Area Calculator using Method Overloading.
Create a class AreaCalculator and overload method area():
- area(int side) => Calculate area of square
- area(int length, int breadth) => Calculate area of rectangle
- area(int base, int height, int type) => Calculate area of triangle
Input:
Enter side : 5
Enter length and breadth : 10 4
Enter base and height : 8 6

Output:
Area of Square : 25
Area of Rectangle : 40
Area of Triangle : 24

Explanation:
Method overloading is used to compute different areas using one method name area().
area(5):
- Square area = side * side = 5 * 5 = 25
area(10, 4):
- Rectangle area = length * breadth = 10 * 4 = 40
area(8, 6, type):
- Triangle area = (base * height) / 2 = (8 * 6) / 2 = 24
- The third parameter 'type' distinguishes it from the rectangle overload.
Java selects the correct version based on number/type of arguments.
This demonstrates practical usage of method overloading for geometric calculations.

Asked In Companies:
Practice assignment*/


import java.util.Scanner;

class AreaCalculator {


    double area(double side) {
        return side * side;
    }


    double area(double length, double breadth) {
        return length * breadth;
    }


    double area(double radius, boolean isCircle) {
        if (isCircle) {
            return 3.14 * radius * radius;
        }
        return 0;
    }


    double area(double base, double height, String type) {
        return 0.5 * base * height;
    }
}

public class oop17q17 {
    public static void main(String[] args) {

        AreaCalculator obj = new AreaCalculator();

        
        System.out.println("Area of Square: " + obj.area(5));

        
        System.out.println("Area of Rectangle: " + obj.area(10, 4));
        
        System.out.println("Area of Circle: " + obj.area(7, true));

    
        System.out.println("Area of Triangle: " + obj.area(8, 6, "triangle"));
    }
}