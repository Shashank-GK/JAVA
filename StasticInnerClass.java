import java.lang.*;
class OuterSI
{
    static int x=10;
    // int y=20;
    static class InnerSI{
        void Display()
        {
            System.out.println(" THE DISPLAY OF OuterSI: "+x);
        }
    }
}
public class StasticInnerClass 
{
    public static void main(String[] arg)
    {
        OuterSI.InnerSI i=new OuterSI.InnerSI();
        i.Display();
    }
}