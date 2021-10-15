import java.lang.*;
import java.util.*;
public class gcd 
{
    public int m;
    public int n;

    int GCD(int m,int n)
    {
      while(m!=n)
        {
          if(m>n)m=m-n;
          else n=n-m;
        }
        return m;
    }
    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        int a;
        int b;
        gcd x=new gcd();
        System.out.println(" ENTER THE VALUE OF TWO NUMBER TO FIND THERE GCD:");    
        a=sc.nextInt();
        b=sc.nextInt();System.out.println(" THE GCD OF THE TWO NUMBERS IS: "+x.GCD(a,b));
    } 
}
