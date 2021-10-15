import java.lang.*;
import java.util.*;
abstract class Shapes {
 
    abstract void dimension();
 
    abstract int area();
 
    abstract int perimeter();
}
 
class Circle extends Shapes {
    public int radius;
 
    public Circle(int r)
    {
        radius=r;
    }
    public void dimension() {
        System.out.println(" THE DIMENSION OF CIRCLE IS CIRCULAR IN SHAPE HAVING RADIUS 'r' :");
    }
 
    public int area() {
        return (int) (radius * radius);
    }
 
    public int perimeter() {
        return (int) (2 * Math.PI * radius);
    }
}
 
class Rectangle extends Shapes {
    public int breadth;
    public int length;
 
    public Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
    public void dimension() {
        System.out.println(" THE DIMENSION OF RECTANGLE IS HAVING BREADTH 'b' AND LENGTH 'l' :");
    }
 
    public int area() {
        return length * breadth;
    }
 
    public int perimeter() {
        return 2 * (length + breadth);
    }
}
 
 class Abstractshapeclass {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
 
        int l;
        int b;
        int rd;
 
        
 
        System.out.println(" ENTER THE LENGTH OF RECTANGLE ");
        l = sc.nextInt();
        System.out.println("ENTER THE BREADTH OF RECTANGLE ");
        b = sc.nextInt();
        System.out.println("ENTER THE RADIUS OF CIRCLE ");
        rd = sc.nextInt();
 
        Shapes c = new Circle(rd);
        Shapes r = new Rectangle(l,b); 
        System.out.println(" ");
 
        System.out.println("THE AREA OF CIRCLE: " + c.area());
        System.out.println(" THE PERIMETER OF CIRCLE: " + c.perimeter());
 
        System.out.println(" ");
 
        System.out.println("THE AREA OF RECTANGLE: " + r.area());
        System.out.println(" THE PERIMETER OF CIRCLE: " + r.perimeter());
    }
}