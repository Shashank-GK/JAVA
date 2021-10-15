import java.lang.*;
class Dominar400
{
    static long Price=221000;
    int a,d;

    static double OnRodePrice(String city)
    {
        switch(city)
        {
            case "Bangalore":
            return Price+(Price*0.1);

            case "Delhi":
            return Price+(Price*0.3);
        }
        return Price;
    }
}
public class Staticmembers 
{
    public static void main(String[] arg)
    {
        System.out.println(" THE EX-SH0W R00M PRICE OF ALL NEW BAJAJ DOMINAR 400 IS:"+Dominar400.Price);
        System.out.println(" THE ACTUAL ON-ROAD PRICE OF ALL NEW DOMINAR 400 IN BANGALORE IS: "+Dominar400.OnRodePrice("Bangalore"));
        System.out.println(" THE ACTUAL ON-ROAD PRICE OF ALL NEW DOMINAR 400 IN DELHI IS: "+Dominar400.OnRodePrice("Delhi"));
    }
}
