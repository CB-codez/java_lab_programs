import java.util.TreeMap;
import java.util.Map;
public class Mapex
{
public static void main(String[] args)
{
Map<String,Integer> ages=new TreeMap<>();
ages.put("Alice",25);
ages.put("Bob",28);
ages.put("cat",30);
ages.put("David",30);
int ele=ages.get("Alice");
System.out.println("=====Alice age===="+ele);
System.out.println("contain key alice"+ages.containsKey("Alice"));
ages.remove("David");
System.out.println("=====after removing===="+ages);
}
}