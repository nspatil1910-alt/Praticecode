/*Question 5: Write a Java program to implement a Temperature Checker.
Create a class Temperature with attribute temp.
Check the weather condition:
- temp > 35 => Hot
- temp 20 to 35 => Normal
- temp < 20 => Cold
Input:
Enter Temperature : 18

Output:
Temperature : 18
Weather : Cold

Explanation:
A class Temperature is created with an instance variable temp.
The user enters a temperature value via Scanner.
An if-else ladder checks the range:
- temp > 35 => Hot
- temp >= 20 && temp <= 35 => Normal
- temp < 20 => Cold
Since 18 < 20, the weather condition is Cold.
If temp = 30, it would print Normal. If temp = 40, it would print Hot.
This demonstrates multi-range conditional logic using class objects.

Asked In Companies:
Practice assignment*/

import java.util.Scanner;

class TemperatureChecker {

    public String checkTemperature(int temp) {

        if (temp > 35) {
            return " Hot";
        } else if(temp >=20 && temp<=35) {
            return "Normal";
           
         } else{
                return "cold";
            }
        }
    }


public class oop5q5 {
    public static void main(String[] args) {

        TemperatureChecker obj = new TemperatureChecker();

        int temp = 13;

        System.out.println(obj.checkTemperature(temp));
    }
}