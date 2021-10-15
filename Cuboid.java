import java.lang.*;
import java.util.Scanner;
class NegativeDimensionException extends Exception{
    public String tostrString()
    {
        return "NEGATIVE DIMENSIONS CAN NOT BE GIVEN";
    }
}

public class Cuboid
{
     public static void main(String[] args) throws NegativeDimensionException
    {
        Scanner sc=new  Scanner(System.in);

        int length,breadth,height;
        int totalArea,volume;
            
        System.out.println(" ENTER THE LENGTH: ");
        length=sc.nextInt();
        System.out.println(" ENTER THE BREADTH: ");
        breadth=sc.nextInt();
        System.out.println(" ENTER THE HEIGHT: ");
        height=sc.nextInt();
         
        
if(length<0 || breadth<0 || height<0)
throw new NegativeDimensionException();
else
        totalArea=2*(length*breadth+length*height+breadth*height);
        volume=length*breadth*height;
try
{
        System.out.println("TOTAL AREA OF CUBOID IS: "+totalArea+" .units");
        System.out.println(" THE VOLUME OF CUBOID IS:  "+volume+" .units");
}
catch(ArithmeticException e)
{
    System.out.println(" NEGATIVE DIMENSIONS CAN NOT BE GIVEN: ");
}
    }
        
} 

