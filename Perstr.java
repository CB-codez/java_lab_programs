// this program is string permutatiions
import java.util.*;
import java.lang.*;
public class Perstr
{
public static void print(String str,String result)
{
if(str.length()<0)
{
System.out.print("string is null");
}
else
{
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
String c=str.substring(0,i)+str.substring(0,i+1);
print(result,c);
}
}

}
public static void main(String[] args)
{
String str="abc";
System.out.println(print(str,""));
}
}
