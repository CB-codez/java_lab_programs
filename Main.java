import java.util.*;
import java.io.*;
import java.lang.*;
 public class Main
{
public static void main(String[] args)
{
    int size;
    Scanner sc=new Scanner(System.in);
    size=sc.nextInt();
    int[] a=new int[size];
   
    System.out.println("enter size:"+size);
     
     System.out.println("enter array elements:");
    for(int i=0;i<size;i++)
    {
        a[i]=sc.nextInt();
    }
    
    System.out.println("original array:"+Arrays.toString(a));
    Arrays.sort(a);
    System.out.println("\nsorted array:"+Arrays.toString(a)); 
}
}
