import java.lang.*;
import java.util.*;
class NegativeDimensionException extends Exception{
    public String todtring()
    {
        return "DIMENSIONS CAN NOT BE NEGATIVE ";
    } 
}

class Circle
{
     public double radius;
    public double area() throws NegativeArraySizeException, NegativeDimensionException
    {
        if(radius<0 || radius==0)
        throw new NegativeDimensionException();
        else
        return Math.PI * radius *radius;
    }
    public double perimeter() throws NegativeDimensionException
    {
        if(radius<0 || radius==0)
        throw new NegativeDimensionException();
        else
        return 2*Math.PI*radius;
    }
    public double circumference() throws NegativeDimensionException
    {
        if(radius<0 || radius==0)
        throw new NegativeDimensionException();
        else
        return perimeter();
    }
}

class Cylinder extends Circle
{
    public double height;
    public double volume()throws NegativeDimensionException
    {
        if(radius<0 || height<0)
        throw new NegativeDimensionException();
        else
        return area()*height;
    }
    public double area() throws NegativeDimensionException
    { 
        if(radius<0 || height<0)
        throw new NegativeDimensionException();
        else
        return 2*Math.PI*radius*(height+radius);
    }
    public double rightCylinder() throws NegativeDimensionException
    {
        if(radius<0 || height<0)
        throw new NegativeDimensionException();
        else 
        return 2*Math.PI*radius*height;
    }
}

public class Circle1 
{
    public static void main(String[] args) throws NegativeArraySizeException, NegativeDimensionException 
        {
           Circle c=new Circle();
           Cylinder c1=new Cylinder();

           Scanner sc=new Scanner(System.in);

           System.out.println(" ENTER THE VALUE OF RADIUS: ");
           int r =sc.nextInt();

           System.out.println(" ENTER THE VALUE OF HEIGHT: ");
           int h =sc.nextInt();
try
{
           c.radius=r;
           c1.height=h;

           System.out.println("THE AREA OF CIRCLE IS:  "+c.area()+" .units");
           System.out.println("THE PERIMETER OF CIRCLE IS:  "+c.perimeter()+" .units");
           System.out.println(" THE CIRCUMFERENCE OF CIRCLE IS: "+c.circumference()+" .units");

           System.out.println("");

           System.out.println("THE AREA OF CYLINDER IS: "+c1.area()+" .units");
           System.out.println(" THE VALUE OF CYLINDER IS: "+c1.rightCylinder()+" .units");
           System.out.println("THE VOLUME OF CYLINDER IS:  "+c1.volume()+" .units");
}
catch(Exception e)
{
    System.out.println(" negative dimensions can not be given :");
}
        } 
}