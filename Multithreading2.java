import java.lang.*;
public class Multithreading2 extends Thread
{
    public void run()
    {
        int i=1;
        while(i==1)
        {
            for(i=1;i<10;i++)
            System.out.println(i+ " hello");
            i++;
        }
    }
    public static void main(String[] arg)
    {
        Multithreading2 m=new Multithreading2();
        m.start();;
        int i=1;
        while(i==1)
        {
            for(i=1;i<10;i++)
            {
                System.out.println(i+ " world");
                i++;
            }
        }
    }
}
