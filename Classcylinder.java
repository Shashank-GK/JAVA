import java.lang.*;
import java.util.*;
    class  Cylinder
{
    private int radius;
    private int height;
    
    public Cylinder()
    {
        radius=height=1;
    }
    public Cylinder(int r,int h)
    {
        radius=r;
        height=h;
    }
    public int getHeight()
    {
        return height;
    }
    public int getRadius()
    {
        return radius;
    }
    
    public void setHeight(int h)
    {
        if(h>=0)
            height=h;
        else
            height=0;
    }
    public void setRadius(int r)
    {
        if(r>=0)
            radius=r;
        else
            radius=0;
    }
    public void setDimensions(int h,int r)
    {
        height=h;
        radius=r;
    }
    
    public double lidArea()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double drumArea()
    {
        return 2*lidArea()+perimeter()*height;
    }
    public double volume()
    {
        return lidArea()*height;
    }
}


public class Classcylinder 
{
    public static void main(String[] args)
    {
        Cylinder c=new Cylinder();
        Scanner sc=new Scanner(System.in);
        System.out.println(" ENTER THE VALUE OF HEIGHT: ");
        int hi=sc.nextInt();
        System.out.println(" ENTER THE VALUE OF RADIUS: ");
        int ri=sc.nextInt();
        c.setHeight(hi);
        c.setRadius(ri);
        c.setDimensions(hi,ri);

        System.out.println("HEIGHT: "+c.getHeight());
        System.out.println("RADIUS: "+c.getRadius());  
        System.out.println("LID AREA: "+c.lidArea());
        System.out.println("CIRCUMFERENCE: "+c.perimeter());
        System.out.println("TOTAL SURFACE AREA: "+c.drumArea());
        System.out.println("VOLUME: "+c.volume());
    } 
}
