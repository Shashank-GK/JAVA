import java.lang.*;
import java.util.*;
interface Member
{
    public void Callback();
}
class Store
{
    Member mem[] =new Member[100];
    int count =0;

    void register(Member m)
    {
        mem[count++]=m;
    }
    void invitesale()
    {
        for(int i=0;i<count;i++)
        mem[i].Callback();
    }
}
class Customer implements Member
{
    String name;
    Customer(String n)
    {
        name = n;
    }
    public void Callback()
    {
        System.out.println(" OK I WILL VISIT,"+name);
    }
}
public class Coustmerinterphase 
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" ENTER YOUR NAME: ");
        String n1=sc.nextLine();
        System.out.println(" ENTER YOUR NAME: ");
        String n2=sc.nextLine();
        Store s=new Store();
        Customer c1=new Customer(n1);
        Customer c2=new Customer(n2);
        s.register(c1);
        s.register(c2);
        s.invitesale();
    }
    
}
