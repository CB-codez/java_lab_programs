import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Iterex
{
public static void main(String[] args)
{
List<String> names=new ArrayList<>();
names.add("Alice");
names.add("Bob");
names.add("cat");
System.out.println("====Implicit iterator======");
for(String name:names)
{
System.out.println(name);
}
System.out.println("====explicit iterator=====");
Iterator<String> it=names.iterator();
while(it.hasNext())
{
String name=it.next();
System.out.println(name);
}
}
}