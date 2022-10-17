import java.lang.*;
import java.util.*;
public class Treeset 
{
    public static void main(String args[])
    {
        TreeSet<Integer> ts=new TreeSet<>(List.of(10,20,30,40));

        ts.add(15);
        ts.forEach((x)->System.out.println(x));
        System.out.println(ts.ceiling(35));
        System.out.println(ts.contains(45));
        System.out.println(ts.floor(25));
    }

}
