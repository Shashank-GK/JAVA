import java.lang.*;
import java.util.*;
public class Maxof3num 
{
    public static void main(String[] args) 
    {
        Scanner Sc=new Scanner(System.in);
        int a,b,c;
        System.out.println(" ENTER THE VALUE OF 3 NUMBERS TO FIND MAXIMUM OF TWO NUMBERS : ");
        a=Sc.nextInt();
        b=Sc.nextInt();
        c=Sc.nextInt();

        System.out.println("  ");
        System.out.println(" THE GREATEST NUMBER OF GIVEN 3 NUMBERS IS : ");
        
        if(a>b && a>c)
        {
            System.out.println(a);
        }
        else if(b>c)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }
        
    }   
}
