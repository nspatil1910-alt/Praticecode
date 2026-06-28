/*Question 27: Write a java program to input marks of five subjects Physics, Chemistry, Biology,
       Mathematics and Computer, calculate percentage and grade according to given conditions:
                    percentage >= 90% : Grade A
                    percentage >= 80% : Grade B
                    percentage >= 70% : Grade C
                    percentage >= 60% : Grade D
                    percentage >= 40% : Grade E
                    percentage < 40% : Grade F
Input:
Physics = 85
Chemistry = 80
Biology = 75
Mathematics = 90
Computer = 70

Output:
Percentage = 80%
Grade = B

Explanation:
Total Marks = 85 + 80 + 75 + 90 + 70 = 400
Percentage = 400 / 5 = 80%
Since percentage is 80%, Grade B is assigned.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class looping27{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a percentage");
       int percentage= sc.nextInt();
  
  if(percentage >= 90)
  {
    System.out.println("perform Grade A");
	}
	else if(percentage >= 80)
	{
	  System.out.println("perform Grade B");
	  }
	  else if(percentage >= 70)
	  {
	    System.out.println("perform Grade C");
		}
	   else if(percentage >= 60)
	   {
	     System.out.println("perform Grade D");
		 }
		 else if(percentage >= 40)
		 {
		   System.out.println("perform Grade E");
		   }
		   else if(percentage < 40)
		   {
		     System.out.println("perform Grade F");
			 }
}
}
		 
  