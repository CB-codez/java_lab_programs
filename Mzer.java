import java.util.*;
public class Mzer
{
public static void fun(int arr[],int size)
{
int c=0;
for(int i=0;i<size;i++)
{
if(arr[i]>1 && arr[i]<20)
{
arr[c]=arr[i];
c++;
}
}
while(c<size)
{
int i=0;
arr[c]=arr[i];
i++;
c++;
}
}
public static void main(String[] args)
{
int n,arr[];
Scanner sc=new Scanner(System.in);
Random rd=new Random();

System.out.println("enter array size");
n=sc.nextInt();
arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=rd.nextInt(1,100);
}
fun(arr,n);
for(int i=0;i<n;i++)
{
System.out.print(arr[i]+",");
}
}
}


