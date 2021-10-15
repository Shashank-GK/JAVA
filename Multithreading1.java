import java.lang.*;
class My extends Thread
{
    public void run()
    {
        int i=1;
        while(i==1)
        {
            for(i=1;i<10;i++)
            System.out.println(i+" hello");
            i++;
        }
    }
}
public class Multithreading1
{
    public static void main(String[] arg)
    {
        My m=new My();
        m.start();;
        int i=1;
        while(i==1)
        {
            for(i=1;i<10;i++)
            System.out.println(i+ " world");
            i++;
        }
    }
}