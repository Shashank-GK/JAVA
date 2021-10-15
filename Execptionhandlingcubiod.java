import java.lang.*;
import java.util.*;
 
class NegativeDimensionException extends Exception  //changes
{
    public String toString()
    {
        return "Dimensions cannot be Negative";
    }
}
 
class Rectangle extends Exception
{
    int length;
    int breadth;
    public Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
    public int perimeter() throws NegativeDimensionException
    {
        if(length<0 || breadth<0)
         throw new NegativeDimensionException();
         else
        return (length+breadth)*2;
    }
    public int area() throws NegativeDimensionException
    {
        if(length<0 || breadth<0)
           throw new NegativeDimensionException();
           else
        return length*breadth;
    }
}
class Cuboid extends Rectangle
{
    int height;
  
    public Cuboid(int l,int b,int h)
    {
        super(l,b);
        height=h;
    }
    public int area() throws NegativeDimensionException
    {
        if(length<0 || breadth<0 || height<0)
        throw new NegativeDimensionException();
        else
        return 2*breadth*height*length;
    }
    public int volume() throws NegativeDimensionException
    {
        if(length<0 || breadth<0 || height<0)
        throw new NegativeDimensionException();
        else
        return length*breadth*height;
    }
    public int totalSurfaceArea()throws NegativeDimensionException
    {
        if(length<0 || breadth<0 || height<0)
        throw new NegativeDimensionException();
        else
        return 2*((length*breadth)+(breadth*height)+(height*length));
    }
}
public class Execptionhandlingcubiod 
{
    public static void main(String[] arg) throws NegativeDimensionException 
    {
      Scanner sc=new Scanner(System.in);  
      
      System.out.println(" ENTER THE VALUE OF HEIGHT: ");
      int h=sc.nextInt();
      System.out.println(" ENTER THE VALUE OF BREADTH: ");
      int b=sc.nextInt();
      System.out.println(" ENTER THE VALUE OF LENGTH: ");
      int l=sc.nextInt(); 
    try
     {
      Rectangle r=new Rectangle(l,b);
      Cuboid c1=new Cuboid(l,b,h);
 
      System.out.println(" THE PERIMETER OF RECTANGLE IS: "+r.perimeter()+" .units");
      System.out.println(" THE AREA OF RECTANGLE IS: "+r.area()+" .units");
      System.out.println(" THE TOTAL SURFACE AREA OF CUBOID IS: "+c1.totalSurfaceArea()+" .units");
      System.out.println(" THE AREA OF CUBOID IS : "+c1.area()+" .units");
      System.out.println(" THE VOLUME OF CUBOID IS : "+c1.volume()+" .units"); 
       
     }
    catch(NegativeDimensionException e)
     {
        System.out.println(e);
     }
    }
}
