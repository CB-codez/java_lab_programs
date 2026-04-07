// this is program is example for File input stream 
import java.io.FileInputStream;
public class Ioex
{
public static void main(String[] args)
{
try
{
FileInputStream f=new FileInputStream("test.txt");
while(true)
{
int i=f.read();
System.out.print(i);
f.close();
}

}
catch(Exception e)
{
System.out.println(e);
}
}
}