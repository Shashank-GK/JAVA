import java.lang.*;
import java.util.*;
public class Radixofnum 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        String num;
        
        System.out.println(" ENTER THE NUMBER TO FIND ITS RADIX");
        num=sc.nextLine();
        
        if(num.matches("[01]+"))
        {
            System.out.println("BINARY RADIX=2");
        }
        else if(num.matches("[0-7]+"))            
        {
             System.out.println("OCTAL RADIX=8");
               
        }
        else if(num.matches("[0-9]+"))            
        {
             System.out.println("DECIMAL RADIX=10");
               
        }
        else if(num.matches("[0-9A-F]+"))            
        {
             System.out.println("HEXA RADIX=16");
               
        }
        else
        {
            System.out.println(" NOT NUMBER: ");
        }
    }  
}
