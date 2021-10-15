import java.lang.*;
import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class Quadraticeqn 
{
    public static void main(String[] arg)
{
    Scanner sc=new Scanner(System.in);
    float a;
    float b;
    float c;
    double root1;
    double root2;
    double imaginary;
    float discriminant;
    double real;
    System.out.println(" ENTER THE CO-EFFICIENT OF QUADRATIC EQUATION: ");
    a=sc.nextFloat();
    b=sc.nextFloat();
    c=sc.nextFloat();
     discriminant = (b*b-4*a*c);

     if(a==0&&b==0)
     {
         System.out.println(" INVALID INPUTS :");
     }
     else if(a==0)
     {
        System.out.println(" LINEAR EQUATION:");
        root1 = -c/b;
        System.out.println(" ROOTS ARE :"+root1);
     }
     else if(discriminant==0)
     {
        System.out.println(" ROOTS ARE REAL AND EQUAL :");
        root1 = -b/(2*a);
        root2 = -b/(2*a);
        System.out.println(" ROOT 1 :"+root1);
        System.out.println(" ROOT 2 IS :"+root2);
     }
     else if(discriminant>0)
     {
         System.out.println(" ROOTS ARE REAL AND DISTINCT:");
         root1=(-b+(Math.sqrt(discriminant)))/(2*a);
         root2=(-b-(Math.sqrt(discriminant)))/(2*a);
         System.out.println(" ROOT 1 :"+root1);
         System.out.println(" ROOT 2 IS :"+root2);
     }
    else
    {
        System.out.println(" THE ROOTS ARE REAL AND IMAGINARY: ");
        real=-b/(2*a);
        imaginary=Math.sqrt(discriminant)/(2*a);
        System.out.println(" ROOT 1 :"+real);
        System.out.println(" ROOT 2 IS :"+imaginary);
    }

}
}
