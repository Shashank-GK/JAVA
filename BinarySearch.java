import java.lang.*;
import java.util.Scanner;
public class BinarySearch 
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int [50];
        int key,i,n,low,high,mid,found=0;
        System.out.println(" ENTER THE NUMBER OF ELEMENTS IN THE ARRAY: ");
        n=sc.nextInt();
        System.out.println(" ENTER THE ELEMENTS YOU WANT TO STORE IN ARRAY: ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(" ENTER THE KEY TO BE SEARCHED: ");
        key=sc.nextInt();
        low=0;
        high=n-1;
    try {
            while(low<=high)
            {
             mid=(low+high)/2;
             if(a[mid]==key)
                {
                    System.out.println(" THE"+key+" KEY IS PRESENT AT THE POSITION OF: "+mid);
                    found=1;
                    break;
                }
             if(a[mid]>key)
             high=mid-1;
             else
             low=mid+1;
            }
        }
     catch(ArithmeticException e)
        {
             System.out.println("THE KEY NOT FOUND: ");
        }
    }   
}
