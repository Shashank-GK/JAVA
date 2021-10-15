import java.lang.*;

class Static
{
    static
    {
        System.out.println("Block 1");
    }
    
    static 
    {
    System.out.println("Block 2");
    }
}

public class Staticblock 
{
    public static void main(String[] args) 
    {
        Static t=new Static();
        System.out.println("Main");
    }
}

