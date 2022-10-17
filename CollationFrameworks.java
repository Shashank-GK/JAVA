
// This program will showcases the Collaction interface Data structure.

import java.lang.*;
import java.util.*;

class Point implements Comparable
{
    int x;
    int y;
    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public String toString()
    {
        return "x="+x+"y="+y;
    }
    public int compareTo(Object o)
    {
        Point p=(Point)o;
        if(this.x<p.x)
            return -1;
        else if(this.x>p.x)
            return 1;
        else
        {
        if(this.y<p.y) 
            return -1;
        else if(this.y>p.y)
            return 1;
        else 
            return 0;
        }
    }
}

public class CollectionFrameworks {

    public static void main(String[] args) {
        
        TreeSet<Point> ts=new TreeSet<>();
        
        ts.add(new Point(0,0));
        ts.add(new Point(1,1));
        ts.add(new Point(2,5));
        ts.add(new Point(3,6));
        ts.add(new Point(4,7));
        ts.add(new Point(5,8));

        System.out.println(ts);
    }
    
}
