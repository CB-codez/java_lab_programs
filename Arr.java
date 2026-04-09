import java.util.*;
class Arr {
    public static void reverseArray(int arr[]) {
        // code here
        int temp,j=arr.length-1;
        
        for(int i=0;i<arr.length;i++)
        {
            if(j>i)
            {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
            }
        }

    }
public static void main(String[] args)
{
int n,arr[];
Scanner sc=new Scanner(System.in);
Random rd=new Random();
System.out.println("enter array size:");
n=sc.nextInt();
arr=new int[n];
for(int i=0;i<arr.length;i++)
{
arr[i]=rd.nextInt(1,10);
System.out.print(arr[i]+",");
}
reverseArray(arr);
System.out.println();

for(int i=0;i<arr.length;i++)
{

System.out.print(arr[i]+",");
}
}
}