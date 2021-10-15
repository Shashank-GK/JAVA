import java.lang.*;
import java.util.*;
class NegativeDimensionException extends Exception
{
    public String tostring()
    {
        return "NEGATIVE DIMENSIONS ARE NOT GIVEN: ";
    }
}
class Circle extends Exception
{
    int radius;
    public int circumference() throws NegativeDimensionException
    {
        if(radius<0)
        throw new NegativeDimensionException();
        else
        return (int) (2*Math.PI*radius);
    }
    public int area() throws NegativeDimensionException
    {
        if(radius<0)
        throw new NegativeDimensionException();
        else
        return (int) Math.PI*radius*radius;
    }
}
class Sphere extends Circle
{
   public double areaOfSphere() throws NegativeDimensionException
   {
       if(radius<0)
       throw new NegativeDimensionException();
       else
       return ((int) 4*Math.PI*radius*radius);
   }
}
public class inheritance 
{
    public static void main(String[] arg) throws NegativeDimensionException
    {
       Scanner sc=new Scanner(System.in);
      // Circle c=new Circle();
       Sphere s=new Sphere();
       int r;
       System.out.println(" ENTER THE RADIUS OF CIRCLE: ");
       r=sc.nextInt(); 
       //c.radius = r;
       try
       {
       s.radius = r;
       System.out.println(" ");
       System.out.println(" THE PERIMETER OF CIRCLE IS :"+s.circumference()+ " .units");
       System.out.println(" THE AREA OF CIRCLE IS :"+s.area()+ " .units");
       System.out.println(" THE AREA OF SPHERE IS :"+s.areaOfSphere()+ " .units");
       }
       catch(ArithmeticException e)
       {
           System.out.println("NEGATIVE VALUE CAN NOT BE GIVEN, try AGAIN ");
       }
    }
}