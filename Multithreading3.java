import java.lang.*;
import java.util.concurrent.ThreadFactory;
class Myrunnable implements Runnable
{
public void run()
{
    int i=1;
    while(i==1)
    {
        for(i=1;i<10;i++)
        {
            System.out.println(i+ " hello");
            i++;
        }
    }
}
} 
public class Multithreading3 
{
    public static void main(String[] arg)
    {
    Myrunnable my=new Myrunnable();
    Thread th=new Thread(my);
    th.start();
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
