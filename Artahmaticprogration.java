import java.lang.*;
import java.util.*;
public class Artahmaticprogration
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println(" THIS PROGRAM IS MEET TO PERFORM THE ARITHMETIC PRORATION OPERATION: ");
        System.out.println(" ENTER THE VALUE OF 'a,'d','n': ");
        int a=sc.nextInt();
        int d=sc.nextInt();
        int n=sc.nextInt();
        
        int term=a;
        for(int i=0;i<n;i++)
        {
            System.out.print(term+",");
            term=term+d;
        }     
    }
}

