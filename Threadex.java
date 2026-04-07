import java.util.*;
// thread example program
 class Gm extends Thread
{
public void run()
{
while(true)
{
try
{
Thread.sleep(1000);
System.out.println("Machi poduuna");
}
catch(InterruptedException e)
{
System.out.print(e);
}
}}
}
class He extends Thread
{
public void run()
{
while(true)
{
try
{
Thread.sleep(2000);
System.out.println("namaste🙏");
}
catch(InterruptedException e)
{
System.out.print(e);
}
}}
}
 class Wl extends Thread

{
public void run()
{
while(true)
{
try
{
Thread.sleep(3000);
System.out.println("suswagatham");
}
catch(InterruptedException e)
{
System.out.print(e);
}
}}
}
public class Threadex{
public static void main(String[] args){
Gm t1=new Gm();
He t2=new He();
Wl t3=new Wl();
t2.setPriority(1);
t1.start();
t2.start();
t3.start();


}
}