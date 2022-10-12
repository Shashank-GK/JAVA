import java.lang.*;
import java.util.*;
public class Arraylist 
{
    public static void main(String args[])
    {
        ArrayList<Integer> al1= new ArrayList<>(20);
        ArrayList<Integer> al2=new ArrayList<>(List.of(10,20,30));
        al1.add(10);
        al1.add(1,20);
        al1.addAll(2,al2);
        System.out.println(al1);
        System.out.println(al1.contains(30));
    }
}
