import java.util.Scanner;
public class oop2{
 public static void main(String x[])
   {
  	     addInteger(10,20);
	   float result=addFloat(5.4f,2.5f);
	   System.out.println("Addition is "+result);
   }
   public static void addInteger(int x,int y)
   {
         System.out.println("Addition is "+(x+y));
   }
   public static float addFloat(float x,float y)
   { return x+y;
   }
}
