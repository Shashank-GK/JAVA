import java.lang.*;
public class Multithreading4 implements Runnable
{
    public void run()
    {
        int i=1;
        while(i==1)
        {
            for(i=1;i<10;i++)
            {
                System.out.println(i+ " hello");
            }
        }
    }

    public static void main(String[] arg)
    {
        Multithreading4 m4=new Multithreading4();
        Thread th=new Thread(m4);
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
