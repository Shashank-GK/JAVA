import java.lang.*;
import java.util.*;
public class Areaoftri extends Exception
{
    public static void main(String[] args) throws NegativeDimensionException
    {
        float base,height;
        double area;
       
        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER THE VALUE OF BASE : ");
        base=sc.nextFloat();

        System.out.println("ENTER THE VALUE OF HEIGHT: ");
        height=sc.nextFloat();
try
{
    if(base<0 || height<0)
    throw new NegativeDimensionException();
    else
        area=base*height*0.5f;
        area=1f/2f*base*height;
        area=base*height/2;

    System.out.println("AREA OF TRIANGLE IS: "+area+" .units");
}
catch (Exception e) 
{
    //TODO: handle exception
    System.out.println(" THE NEGATIVE DIMENSIONS ARE NOT ALLOWED: TRY AGAIN: ");
}
    }
}