import java.lng.*;
import java.util.*;
public class Website 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String url;
        String protocol;
        System.out.println(" ENTER THE URL: ");
        url=sc.nextLine();
     
        protocol=url.substring(0, url.indexOf(":"));
        
        if(protocol.equals("http"))
            System.out.println("Hypertext Transfer Protocol");
        else if(protocol.equals("ftp"))
            System.out.println("File Transfer Protocol");
        
        
        String ext=url.substring(url.lastIndexOf(".")+1);
        
        if(ext.equals("com"))
            System.out.println("Commercial");
        else if(ext.equals("org"))
            System.out.println("Organization");
        else if(ext.equals("net"))
            System.out.println("Network");
            
    }
}
