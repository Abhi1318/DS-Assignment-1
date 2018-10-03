package datastructures;
import java.util.*;
public class ArrayGreatestElement 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        System.out.print("Enter Size of Array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Entered Array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("\nGreatest Element: "+max);
    }
    
}
