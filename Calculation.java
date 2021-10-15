import java.lang.*;
import java.util.*;
class Calculation
{
    public static void main(String[] args) 
    {
        int num1,num2;
        char choice;
        float result=0; 
        Scanner sc=new Scanner(System.in);
        System.out.println(" THESE ARE THE CHOICE YOU NEED TO ENTER TO PERFORM THE CALCULATIONS '+','-','*','/' :");
        System.out.println(" ENTER THE CHOICE TO PERFORM THE CALCULATIONS :");
        choice=sc.next().charAt(0);

        System.out.println(" ");

        System.out.println(" ENTER THE FIRST NUMBER: ");
        num1=sc.nextInt();

        System.out.println(" ENTER THE SECOND NUMBER ");
        num2=sc.nextInt();

        switch(choice) 
        {
            case'+':
            result=num1+num2;
            break;

            case'-':
            result=num1-num2;
            break;

            case '*':
            result=num1*num2;
            break;

           
            case '/':
            try
            {
            result=num1/num2;
            break;
            }
            catch (Exception e) 
            {
                //TODO: handle exception
                System.out.println(" THE DENOMINATOR MUST NOT BE '0' , TRY AGAIN");
            }
            

            default:
            System.out.println(" YOU HAVE ENTERED INVALID INPUTS, CAN'T YOU SEE THE ABOVE INSTRUCTION:");
        }
        System.out.println(" THE SOLUTION IS: "+result);
    }
}