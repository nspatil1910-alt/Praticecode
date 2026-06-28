/*void setMarks(int s1,int s2,int s3,int s4,int s5,int s6): this function accept marks of six subjects 
void calPer(): this function is used for calculate percentage of six subject marks and display it


Example with source code 
*/
import java.util.Scanner;
 class per{
        int sub1,sub2,sub3,sub4,sub5,sub6;
        void setMarks(int s1 ,int s2,int s3,int s4,int s5,int s6){
                sub1 = s1;
                sub2 = s2;
                sub3 = s3;
                sub4 = s4;
                sub5 = s5;
                sub6 = s6;

         }
            
	}
	void calPer()
	{
	   int agg=sub1+sub2+sub3+sub4+sub5+sub6;
	   int per=agg/6;
	   System.out.println("Percentage is  "+per);
	}

public class PerApplication
{
     public static void main(String x[])
	 {
	    Per p = new Per();
		p.setMarks(60,60,60,60,60,60);
		p.calPer();
	 }
}

        
   