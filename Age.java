
import java.lang.*;
import java.util.*;
public class Age 
{
    public static void main(String[] args) 
    {
           
           int age;
           
           Scanner sc=new Scanner(System.in);
           
           System.out.println("ENTER YOUR AGE: ");
           age=sc.nextInt();
           
           if(age>=10 && age<=20)
           {
               System.out.println(" YOU ARE STILL YOUNG ");
           }
           else if(age>=20 && age<=40)
           {
               System.out.println(" YOU ARE ADULT ");
           } 
           else if(age>=40 && age<=80)
           {
               System.out.println(" YOU ARE OLD ");
           }
    }
}
