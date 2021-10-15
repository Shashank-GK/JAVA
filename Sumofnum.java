import java.lang.*;
import java.util.*;
public class Sumofnum 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println(" ENTER THE NUMBER: ");
        int n=sc.nextInt();
     
           int sum=0;
           
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        
        System.out.println("SUM OF "+n+" NUMBER IS "+sum);
    } 
}
