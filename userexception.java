
import java.util.*;
class EmptyException extends Exception
{
EmptyException()
{
super("empty");
}
public String toString()
{
return"out of stock";
}
}
class orderset
{
int a;
int limit=3;
orderset(int b)throws EmptyException
{
a=b;
if(a>limit||a<=0)
throw new EmptyException();
else
{
System.out.println("your order is successful");
}
}
}
public class userexception
{
public static void main(String args[])
{
try
{
Scanner obj1=new Scanner(System.in);
System.out.println("enter no of objects do you want ");
int x=obj1.nextInt();
orderset obj=new orderset(x);
}
catch(EmptyException e)
{
System.out.println(e.toString());
}
}
}