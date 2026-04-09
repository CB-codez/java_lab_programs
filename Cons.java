import java.util.*;
public class Cons
{
String name,age;
Cons()
{
name="bhagavan";
age="18.99999999999";
System.out.println("name=="+name+" age=="+age);
}
Cons(String name)
{
this.name=name;
age="18";
System.out.println("name=="+name+" age=="+age);
}
Cons(String name,String age)
{
this.name=name;
this.age=age;
System.out.println("name=="+name+" age=="+age);
}
public static void main(String[] args)
{
System.out.println("this is default constructor");
Cons c=new Cons();
System.out.println("this is parametersized constructor");

Cons c1=new Cons("krishna");
System.out.println("this is parametersized constructor");

Cons c2=new Cons("kailash","19");
}
}


