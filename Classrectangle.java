import java.lang.*;
import java.util.*;
class Rectangle
{
    public double length;
    public double breadth;
    
    public double area()
    {
        return length*breadth;
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

public class Classrectangle 
{
    public static void main(String[] args) 
    {
        Rectangle r=new Rectangle();
        Scanner sc=new Scanner(System.in);
        int l;
        int b;
        System.out.println(" ENTER THE VALUE OF LENGTH: ");
        l=sc.nextInt();
        System.out.println(" ENTER THE VALUE OF BREADTH: ");
        b=sc.nextInt();
        r.length=l;
        r.breadth=b;
        
        System.out.println("AREA "+r.area()+" .units");
        System.out.println("PERIMETER "+r.perimeter()+" .units");
        
        System.out.println("IS IT A SQUARE: "+r.isSquare());
    }
}