import java.lang.*;
import java.util.*;
public class Evenorodd 
{
    public static void main(String[] args) 
    {
           int n;
           
           Scanner sc=new Scanner(System.in);
           
           System.out.println(" ENTER THE NUMBER: ");
           n=sc.nextInt();
           
           if(n%2==0)
           {
               System.out.println(" IT IS AN EVEN NUMBER: ");
           }
           else
           {
               System.out.println(" IT IS AN ODD NUMBER: ");
           }
    }  
}
