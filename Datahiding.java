import java.lang.*;
import java.util.*;

class Rectangleclass
{
    protected double length;
    protected double breadth;
    public int setLength;
    public int setBreadth;
    
    public double getLength()
    {
        return length;
    }
    
    public double getBreadth()
    {
        return breadth;
    }
    
    public void setLength(double l)
    {
            length=l;
    }
    
    public void setBreadth(double b)
    {
            breadth=b;
    }
    
    public double area()
    {
        return getLength()*getBreadth();
    }
    
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    
    public boolean isSquare()
    {
        if(length==breadth)
            return true;
        else 
            return false;
    }
}
class cubiod extends Rectangleclass
{
    private double height;
    public int setheight;

    public double getheight()
    {
        return height;
    }
    public double setheight(double h)
    {
        return height=h;
    }
    public double totalSurfaceArea()
    {
        return 2*((length*breadth)+(breadth*height)+(height*length));
    }
    public double lateralSurfaceArea()
    {
        return 2*(length+breadth)*height;
    }
    public double volume()
    {
        return (length*breadth*height);
    }
}
        

public class Datahiding 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
       // Rectangle r=new Rectangle();
       cubiod c=new cubiod();
        System.out.println(" ENTER THE LENGTH OF RECTANGLE: ");
        double l=sc.nextDouble();
        System.out.println(" ENTER THE BREADTH OF RECTANGLE: ");
        double b=sc.nextDouble();
        System.out.println(" ENTER THE HEIGHT OF CUBOID: ");
        double h=sc.nextDouble();
        c.setLength(l);
        c.setBreadth(b);
        c.setheight(h);

        System.out.println(" THE ENTERED LENGTH IS: "+c.getLength()+" .units");
        System.out.println(" THE ENTERED BREADTH IS: "+c.getBreadth()+" .units");
        System.out.println(" ");
        System.out.println(" THE AREA OF RECTANGLE IS: "+c.area()+" .unitts");
        System.out.println(" THE PERIMETER OF RECTANGLE IS: "+c.perimeter()+" .units");
        System.out.println("IS GIVEN DIMENSIONS WILL FORM SQUARE: "+c.isSquare()+" .units");
        System.out.println(" ");

        System.out.println(" THE ENTERED HEIGHT IS:  "+c.setheight(h)+" .units");
        System.out.println(" ");

        System.out.println(" THE TOTAL SURFACE ARE OF CUBOID IS: "+c.totalSurfaceArea()+" .units");
        System.out.println(" THE LATERAL SURFACE AREA OF CUBOID IS: "+c.lateralSurfaceArea()+" .units");
        System.out.println(" THE VOLUME OF CUBOID IS: "+c.volume()+" .units");
    }
}
