import java.lang.*;
import java.util.*;
public class day 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println(" ENTER THE DAY NUMBER: ");
        int day=sc.nextInt();
        
        if(day==1)
        {
            System.out.println("MONDAY ");
        }
        else if(day==2)
        {
              System.out.println("TUESDAY");
        }
        else if(day==3)
        {
              System.out.println("WEDNESDAY");
        }
        else if(day==4)
        {
              System.out.println("THURSDAY");
        }
        else if(day==5)
        {
              System.out.println("FRIDAY");
        }
        else if(day==6)
        {
              System.out.println("SATURDAY ");
        }
        else if(day==7)
        {
              System.out.println("SUNDAY");
        }
        else
        {
            System.out.println("INVALID NUMBER OF DAY: ");
        }
    }
}
