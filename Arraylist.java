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
        
         /*Iteration Method */
        
        for(int i=0;i<al1.size();i++)
        {
            System.out.println(al1.get(i));
        }
        
        /*for(Integer x:al1) 
        {
            System.out.println(x);
        }*/
         al1.forEach(n ->show(n));
    }
    static void show(int n)
    {
    if(n>90)
    {
        System.out.println(n);
    }
}
