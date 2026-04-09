import java.util.*;
public class Rd
{
public static void main(String[] args)
{
int size;
Scanner sc=new Scanner(System.in);
System.out.println("enter array size:");
size=sc.nextInt();
Integer[] arr1 = new Integer[size];

System.out.println("enter array elements===");
for(int i=0;i<size;i++)
{
arr1[i]=sc.nextInt();
}

System.out.println("array elements==\n"+Arrays.toString(arr1));
Arrays.sort(arr1);
Set<Integer> set = new HashSet<>(Arrays.asList(arr1));
System.out.println("array elements==\n"+Arrays.toString(arr1));
System.out.println("removed deuplicates:"+set);
}

}