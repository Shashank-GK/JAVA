import java.lang.*;
import java.util.Scanner;
public class Exceptionhandl
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" ENTER THE FIRST NUMBER: ");
        int a=sc.nextInt();
        System.out.println(" ENTER THE SECOND NUMBER: ");
        int b=sc.nextInt();
        int c;
        try{
            c=a/b;
            System.out.println(" the solution is:"+c );
        }
        catch(ArithmeticException e)
        {
            System.out.println("DENOMINATOR MUST NOT BE ZERO, TRY AGAIN:");
        }
        System.out.println("THANK YOU: ");
    }
}

