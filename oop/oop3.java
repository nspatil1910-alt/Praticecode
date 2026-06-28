/*Example: we want to design the API for sorting for integer data , character data etc */
import java.util.Scanner;
public class oop3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.In);

        int []a = new int []{5,4,3,1,2};
        char c[]= new char[]{'d','a','b','c','e'};

        System.out.println("Display integer array before sorting");
        for(int i=0;i<a.length;i++){
            System.out.printf("%d\t",a[i]);
        }
        System.out.println("Display character array after sorting");
        for(int i=0;i<c.length;i++){
            { System.out.printf("%c\t",c[i]);
	  }
	  sort(a);
	  sort(c); 
	  System.out.println("\nDisplay integer array after sorting");
	  for( i=0; i<a.length; i++)
	  { System.out.printf("%d\t",a[i]);
	  }
	  System.out.println("\nDisplay character array after sorting");
	  for( i=0; i<c.length; i++){  
        System.out.printf("%c\t",c[i]);
	  }
   }
   public static void sort(int a[]){
      for(int i=0; i<a.length; i++)
	  {
	     for(int j=(i+1);j<a.length; j++)
		 {
		    if(a[i]>a[j])
			{
			   int temp=a[i];
			   a[i]=a[j];
			   a[j]=temp;
			}
		 }
	  }
   }
   public static void sort(char ch[])
   { 
      for(int i=0; i<ch.length; i++)
	  {
	     for(int j=(i+1);j<ch.length; j++)
		 {
		    if(ch[i]>ch[j])
			{
			   char temp=ch[i];
			    ch[i]=ch[j];
			    ch[j]=temp;
			}
		 }
	  }
	   
   }
}
}


  