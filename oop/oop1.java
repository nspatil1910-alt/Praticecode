import java.util.Scanner;
    public class oop1{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
         add(10,20);
	     float result=add(5.4f,2.5f);
	    System.out.println("Addition is "+result);
   }
     public static void add(int x,int y)
    {  	
  System.out.println("Addition is "+(x+y));
   }
   public static float add(float x,float y)
   {
 return x+y; 
   }
}

   