import java.util.*;
public class Minmax
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
Arrays.sort(arr);
System.out.println("min=="+arr[0]);
System.out.println("max=="+arr[arr.length-1]);
}
}




