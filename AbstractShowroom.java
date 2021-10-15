import java.lang.*;
import java.util.*;
abstract class Suzike
{
    abstract void showroom();
    abstract void areaOfShowroom();
    abstract void labours();
    abstract void billing();
    abstract void spareParts();
}
class Shruthimotors extends Suzike
{
    public void showroom() 
    {
        System.out.println(" WELL COME TO FAMILY OF SUZIKE MOTOR :"); 
    }

    public void areaOfShowroom()
    {
       System.out.println(" OUR SHOWROOM HAS EXTENDED UPTO THE AREA OF 1 ACERE: ");  
    }

    public void labours() 
    {
        System.out.println(" WE HAVE VERY SKILLLED FULL KABOURS:  ");     
    }

    public void billing() 
    {
        System.out.println(" WE HAVE AN ACCOUTENT TO CHECK BILLING:  ");  
    }

    public void spareParts() 
    {
        System.out.println(" WE CAN CONTACT YOU FAOR OUR CARS SPAREPARTS: ");  
    }
    
}
public class AbstractShowroom 
{
   public static void main(String[] arg)
    {
       Suzike s=new Shruthimotors();
       s.areaOfShowroom();
       s.billing();
       s.labours();
       s.showroom();
       s.spareParts();
    }
}
