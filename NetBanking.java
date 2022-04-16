import java.lang.*;
import java.util.*;

class Details
{
    String name;
    int DOB;
    int AccountNumber;
    int AccountType;
    Scanner sc=new Scanner(System.in);
     public void AccountDetails()
     {
         System.out.println("Enter the Account holder name");
         name=sc.nextLine();
         System.out.println("Enter the Date of birth:");
         DOB=sc.nextInt();
     }
    public void AccType()
    {
         System.out.println("Choose the banking type:");
         System.out.println("1. Savings Account");
         System.out.println("2.current Account");
         System.out.println("3.Money Market Account");
         AccountType=sc.nextInt();
    }
     
}
class AccountType extends Details
{
    public void Type()
    {
        System.out.println("\n************************************************************************************\n");
        System.out.println("Choose the banking type:");
        System.out.println("1. Savings Account");
        System.out.println("2.current Account");
        System.out.println("3.Money Market Account");
            int AccountType=sc.nextInt();
            if(AccountType==1)
            {
                System.out.println("your Account type is savings account type:");
                System.out.println("thank you");
            }
            if(AccountType==2)
            {
                System.out.println("Sorry you can not use this app for net banking:");
            }
            if(AccountType==3)
            {
                System.out.println("Sorry you can not use this app for net banking:");
            }
    } 
}
class deposition extends AccountType
{
    int AmDeposit;
    int AmBalance = 0;
    int AmmBalance;
    int Amwithdraw;
    int SwithChoice;
    public void banking()
    {
        System.out.println("Choose the options you ");
        System.out.println("1.Deposite");
        System.out.println("2.Check Balance");
        System.out.println("3.Withdraw");
        SwithChoice=sc.nextInt();

        switch(SwithChoice)
        {
            case 1:
            System.out.println("Enter the Amount you want to deposit only through UPI: ");
            System.out.println("Enter the UPI number");
            System.out.println("press 1 to continue:");
            int UPI =sc.nextInt();

            if(UPI==1)
            {
                AmDeposit=AmBalance+AmDeposit;
                System.out.println("You had deposited Rs."+AmDeposit);
                System.out.println("your current balance is Rs."+AmBalance);
                break;
            }
            else
            {
                System.out.println("try again");
            }
             
            case 2:
            AmmBalance = AmBalance;
            System.out.println("your current Balance is Rs."+AmmBalance);
            break;

            case 3:
            System.out.println("Enter the amount withdraw");
            Amwithdraw = AmBalance - Amwithdraw;
            System.out.println("You had withdrawn thr Rs."+Amwithdraw);
        }
    }
}
public class NetBanking
{
   public static void main(String arg[])
   {
       Details D=new Details();
       D.AccountDetails();
       D.AccType();
   }
}

