import java.util.*;
public class Array
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a size:");
int size=sc.nextInt();
int[] arr=new int[size];
for(int i=0;i<size;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("entered array elements are\n:"+Arrays.toString(arr));
System.out.println("enter smallest number:");
int min=sc.nextInt();
System.out.println("enter biggest number:");
int max=sc.nextInt();
for(int i=0;i<arr.length;i++)
{
if(arr[i]==min && arr[i]==max)
{
System.out.println("enter biggest number:"+min+max);
}
}
}
}


