import java.lang.*;
import java.util.*;
public class Hashset 
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
        HashSet<Integer> hs=new HashSet<>(20,0.75f);
        
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);
        hs.add(40);

        System.out.println("Enter the number to find that n]in Hash table: ");
        int n=sc.nextInt();
       System.out.println(hs.contains(n));
        
        System.out.println(hs);
    }
}
