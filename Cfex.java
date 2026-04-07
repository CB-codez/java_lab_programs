import java.util.ArrayList;
import java.util.List;
public class Cfex
{
public static void main(String[] args)
{
List<String> l=new ArrayList<>();
l.add("Alice");
l.add("bob");
l.add("cat");
String animal=l.get(0);
System.out.println("first element:"+animal);
l.remove(1);
System.out.println("After:"+l);
((ArrayList<String>) l).addFirst("Alex");
System.out.println("first=="+l.getFirst());
((ArrayList<String>) l).addLast("Domino");
System.out.println("last=="+l.getLast());

}
}


