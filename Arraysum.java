import java.lang.*;
import java.util.*;
public class Arraysum
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int A[]=new int[10];
        int sum=0;
        System.out.println("  ENTER THE NUMBER OF TERMS: ");
        int n=sc.nextInt();
        System.out.println(" ENTER THE NUMBER IN ROW TO FIND THERE SUM: ");
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        for(int x:A)
        {
            sum=sum+x;
        }
        System.out.println("SUM IS: "+sum);    
    }  
}