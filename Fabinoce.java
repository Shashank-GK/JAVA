import java.lang.*;
import java.util.*;
public class Fabinoce 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println(" THIS PROGRAM IS MEET TO FIND THE FIBONACCI SERIES IF NUMBER: ");
        System.out.println("ENTER THE NUMBER OF TERMS: ");
        int n=sc.nextInt();
        
        int a=0,b=1,c;
        
        System.out.print(a+","+b+",");
        for(int i=0;i<n-2;i++)
        {
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }
}
