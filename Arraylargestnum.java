import java.lang.*;
import java.util.*;
public class Arraylargestnum 
{
     public static <A> void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        int A[] =new int[10];
        int max1,max2;
        int n;

        System.out.println(" ENTER THE NUMBER ELEMENTS THAT YOU WANT TO ENTER: ");
        n=sc.nextInt();

        System.out.println(" ENTER THE ROW OF NUMBERS TO FIND THE GREATEST OF THEM: ");
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }

        max1=max2=A[0];
        
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max1)
            {
                max2=max1;
                max1=A[i];  
            }
            else if(A[i]>max2)
            {
                max2=A[i];
            }
        }
        System.out.println("THE FIRST LARGEST NUMBER IS:  "+max1);   
        System.out.println("THE SECOND LARGEST NUMBER IS:  "+max2);   
    }  
}
