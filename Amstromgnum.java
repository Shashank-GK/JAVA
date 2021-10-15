import java.lang.*;
import java.util.*;
public class Amstromgnum 
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);

       System.out.println("ENTER THE NUMBER: ");
       int n=sc.nextInt();
       
       int m=n;
       int sum=0;
       int r;
       while(n>0)
       {
        r=n%10;
        n=n/10;
        
        sum=sum+r*r*r;
       }
        if(sum==m)
            System.out.println("IT IS AN ARMSTRONG NUMBER: ");
        else
            System.out.println("IT IS NOY AN ARMSTRONG NUMBER");
    } 
}
