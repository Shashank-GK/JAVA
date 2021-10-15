import java.lang.*;
import java.util.*;
class Rectangle extends Exception
{
    int length;
    int breadth;
    
    public int perimeter() throws NegativeDimensionException
    {
        if(length<0 || breadth<0)
         throw new NegativeDimensionException();
        return (length+breadth)*2;
    }
    public int area() throws NegativeDimensionException
    {
        if(length<0 || breadth<0)
           throw new NegativeDimensionException();
        return length*breadth;
    }
}
class Cuboid extends Rectangle
{
    int height;
  
    public int area() throws NegativeDimensionException
    {
        if(length<0 || breadth<0 || height<0)
        throw new NegativeDimensionException();
        return 2*breadth*height*length;
    }
    public int volume() throws NegativeDimensionException
    {
        if(length<0 || breadth<0 || height<0)
        throw new NegativeDimensionException();
        return length*breadth*height;
    }
    public int totalSurfaceArea()throws NegativeDimensionException
    {
        if(length<0 || breadth<0 || height<0)
        throw new NegativeDimensionException();
    
        return 2*((length*breadth)+(breadth*height)+(height*length));
    }
}
public class classcubiod
{
    public static void main(String[] arg) throws NegativeDimensionException 
    {
      Scanner sc=new Scanner(System.in);  
     // Rectangle r=new Rectangle();
      Cuboid c1=new Cuboid();
      System.out.println(" ENTER THE VALUE OF HEIGHT: ");
      int h=sc.nextInt();
      System.out.println(" ENTER THE VALUE OF BREADTH: ");
      int b=sc.nextInt();
      System.out.println(" ENTER THE VALUE OF LENGTH: ");
      int l=sc.nextInt(); 
    try
     {
      c1.length=l;
      c1.breadth=b;
      c1.height=h;

      System.out.println(" THE PERIMETER OF RECTANGLE IS: "+c1.perimeter()+" .units");
      System.out.println(" THE AREA OF RECTANGLE IS: "+c1.area()+" .units");
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