import java.util.*;

public class Rd2
{
static int remDup(int[] arr,int n)

{
if(n==1||n==0)
{
return n;
}
Arrays.sort(arr)
int[] temp=new int[n];
int j=0;
temp[j++]=arr[0];
for(int i=0;i<n;i++)
{
if(arr[i]!=arr[i-1])
{
temp[j++]=arr[i];
}
}
for(int i=0;i<j;i++)
{
arr[i]=temp[i];
}
return j;
}

public static void main(String[] args)
{
int arr;
int size;
Scanner sc=new Scanner(System.in);
System.out.println("enter array size:===");
size=sc.nextInt();
arr=new int[size];
System.out.println("enter array elements:===");
for(int i=0;i<size;i++)
{
arr[i]=sc.nextInt();
}
arr=rem(arr,size);
System.out.println("after  array elements:===");
for(int i=0;i<size;i++)
{
System.out.println("enter array elements:==="+Arrays.toString(arr));
}
}
}




