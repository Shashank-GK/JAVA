import java.lang.*;
import java.util.*;
public class Metercharge
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        String name;
        float unit;
        float metercharge=100;
        System.out.println(" ENTER YOUR NAME: ");
        name=sc.nextLine();
        System.out.println(" ENTER THE UNITS CONSUMED: ");
        unit=sc.nextFloat();
        if(unit<=200)
        {
            metercharge=(float) (metercharge+(unit*0.80));
        }
        else if(unit>200 && unit<=300)
        {
            metercharge=(float) (metercharge+(200*0.80)+((unit-200)*0.90));
        }
        else if(unit>300 && unit<=400)
        {
            metercharge=(float) (metercharge+(200*0.80)+(100*0.90)+((unit-300)*1));
        }
        else if(metercharge>400)
        {
            metercharge=(float) (metercharge+(metercharge*0.15));
        }
        System.out.println("NAME:"+name);
        System.out.println(" THE NUMBER OF UNITS CONSUMED:"+unit+" .units");
        System.out.println(" THE EXPECTED METER CHARGE IS :"+metercharge+" .Rs");
        System.out.println("THANK YOU:");
    }
}