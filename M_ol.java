
 public class M_ol
{
int add(int a,int b)
{
System.out.println("addition of a&b"+(a+b));
return 0;
}
int add(int a,int b,int c)
{
System.out.println("addition a&b&c"+(a+b+c));
return 0;
}

public static void main(String[] args)
{

M_ol ob1=new M_ol();
M_ol ob2=new M_ol();
ob1.add(2,3);
ob2.add(2,3,5);
}
}

