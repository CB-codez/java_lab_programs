import java.util.*;
public class Trycatchex
{
public static void main(String[] args)
{
try
{
int[] a={1,2,3};
System.out.println(a[3]);
int res=10/0;
int b=10.7;
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e.getMessage());
}
catch(ArithmeticException e)
{
System.out.println("zero division isnt posiible"+e.getMessage());
}
catch(NumberFormatException e)
{
System.out.println("an error"+e.getMessage());
}
}

}
