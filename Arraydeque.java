import java.lang.*;
import java.util.*;
public class Arraydeque 
{
    public static void main(String arg[])
    {
        ArrayDeque<Integer> dq=new ArrayDeque<>();

        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);


        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);

        dq.pollLast();
        dq.pollFirst();

        dq.forEach((x)->System.out.println(x));
    }   
}
