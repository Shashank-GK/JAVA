import java.lang.*;
import java.util.Scanner;
public class Marks 
{
    public static void main(String[] args) 
    {
           int m1,m2,m3;
           int totalMarks;
           
           Scanner sc=new Scanner(System.in);
           
           System.out.println(" ENTER THE MARKS OF 3 SUBJECTS: ");
           m1=sc.nextInt();
           m2=sc.nextInt();
           m3=sc.nextInt();

           totalMarks=m1+m2+m3;
           System.out.println(" YOU HAD SECURED THE TOTAL MARKS OF :"+totalMarks);
           
           float avg=(float)(m1+m2+m3)/3;
           
           if(avg>=70)
           {
               System.out.println("GRADE A");
           }
           else if(avg>=60 && avg<70)
           {
               System.out.println("GRADE B");
           }
           else if(avg>=50 && avg<60)
           {
               System.out.println("GRADE C");
           }
           else if(avg>=40 && avg<50)
           {
               System.out.println("GRADE D");
           }
           else 
           {
               System.out.println("GRADE E");
           }
    }
}

    