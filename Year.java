import java.lang.*;
import java.util.*;
public class Year 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println(" ENTER THE YEAR NUMBER: ");
        int year=sc.nextInt();
        
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                     System.out.println(" ITS IS LEAP NUMBER: ");
                    
                }
                else
                    System.out.println("IT IS NOT A LEAP YEAR: ");
                    
                
            }
            else
            {
                  System.out.println("IT IS LEAP NUMBER: ");

            }
            
        }
        else
        {
            System.out.println("NOT LEAP YEAR: ");
        }
    }
}
