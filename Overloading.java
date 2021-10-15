import java.lang.*;
import java.util.*;
 class Test
{
    public int max(int a,int b)
    {
        if(a>b)
        return a;
        else
        return b;
    }
    
    public int max(int a,int b,int c)
    {
        if(a>b && a>c)
        return a;
        else if(b>c) 
        return b;
        else
        return c;
    }
}

public class Overloading 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Test t=new Test();
        int a,b,c;
        System.out.println("    ENTER THE VALUE OF 'a','b','c':");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        t.max(a,b);
        t.max(a,b,c);
        System.out.println(" THE MAXIMUM OF THE NUMBERS IS " +t.max(a,b));
        System.out.println(" THE MAXIMUM OF THE NUMBERS IS " +t.max(a,b,c));
    }
    
}

