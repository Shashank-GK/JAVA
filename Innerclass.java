import java.lang.*;
class Outer
{
    void Display()
    {
        class Inner
        {
            void innerDisplay()
            {
                System.out.println(" DISPLAY OF INNER CLASS: ");
            }
        }
        Inner i=new Inner();
        i.innerDisplay();
    }
}
public class Innerclass 
{
    public static void main(String[] arg)
    {
        Outer o=new Outer();
        o.Display();
    }   
}
