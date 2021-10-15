import java.lang.*;
abstract class Me
{
    abstract void Display();
}
class OuterAI
{
    public void method()
    {
        Me m=new Me()
        {
            @Override
            void Display() 
            {
                // TODO Auto-generated method stub
                System.out.println(" THE DISPLAY OF OUTER: ");
            }
        };
        m.Display();
    }
}
public class AnonymousInnerClass 
{
    public static void main(String[] arg)
    {
        OuterAI o=new OuterAI();
        o.method();
    }
}
