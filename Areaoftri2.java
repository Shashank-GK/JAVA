import java.lang.*;
import java.util.*;
public class Areaoftri2 extends Exception
{
    public static void main(String[] arg) throws NegativeDimensionException
    {
        int a,b,c;
        int s;
        int area;
        Scanner sc=new Scanner(System.in);
        System.out.println(" ");
        System.out.println("ENTER THE VALUE OF A SIDE: ");
        a=sc.nextInt();

        System.out.println("ENTER THE VALUE OF B SIDE: ");
        b=sc.nextInt();

        System.out.println("ENTER THE VALUE OF C SIDE: ");
        c=sc.nextInt();
try
{
    if(a<0 || b<0 || c<0)
    throw new NegativeDimensionException();
    else
        s=(int)(a+b+c)/2;
        area= (int) Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println(" ");
        System.out.println("AREA OF TRIANGLE FOR VALUE OF 'a','b','c' IS: "+area+" .units");
}
catch(Exception e)
{
    System.out.println(" NEGATIVE DIMENSIONS ARE NOT ALLOWED: TRY AGAIN ");
}
    }
}
