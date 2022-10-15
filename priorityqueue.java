import java.lang.*;
import java.util.*;

/* To get larger number as peek element */
/*
class MyCom implements Comparator<Integer>
{
    public int compare(Integer o1,Integer o2)
    {
        if(o1<o2)return 1;
        if(o1>o2) return -1;
        return 0;
    }
}
*/

public class Priorityqueue 
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        /*  To get larger number as peek element 
            PriorityQueue<Integer> pq=new PriorityQueue<>(new MyCom());
        */

        pq.add(40);
        pq.add(10);
        pq.add(20);
        pq.add(30);

/*To check the peek element of PriorityQueue */
    System.out.println(pq.peek());

/* To print all the elements */
    pq.forEach((x)->System.out.println(x));

/* To delate th element */
    pq.poll();
    
/* After deletion operation */
    System.out.println("After deletion operation");
    pq.forEach((x)->System.out.println(x)); 

    }
}
