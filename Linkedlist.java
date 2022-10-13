import java.lang.*;
import java.util.*;
public class Linkedlist 
{
    public static void main(String args[])
    {
        LinkedList<Integer> al1= new LinkedList<>();
        LinkedList<Integer> al2=new LinkedList<>(List.of(10,20,30,40,50,60));

        al1.add(1);
        al1.add(0, 40);
        al1.addAll(2, al2);
        al1.set(4, 5);
        System.out.println(al1.contains(al2));
        System.out.println(al1.equals(al2));
        System.out.println(al1.get(1));

        al1.forEach(n->show(n));
    }
    static void show(int n)
    {
        System.out.println(n);
    }
}
