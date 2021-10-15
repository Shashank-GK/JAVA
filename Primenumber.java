import java.lang.*;
import java.util.*;
public class Primenumber 
{
    static boolean isPrime(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;    
    }  
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner (System.in);
       int n;
       System.out.println(" ENTER THE NUMBER TO FIND IF IT IS PRIME NUMBER OR NOT: ");
       n= sc.nextInt();
       if(isPrime(n))
       System.out.println(n+" IS A PRIME NUMBER: ");
       else
       System.out.println(n+" IS NOT A PRIME NUMBER: ");
    }
}
