import java.util.Scanner;
class selectiondemo
{
public static void main(String args[])
{
Scanner ip=new Scanner(System.in);
System.out.println("enter your choice:");
int n=ip.nextInt();
switch(n)
{
case 1:
	System.out.println("one");
	break;
case 2:
	System.out.println("two");
	break;
case 3:
	System.out.println("three");
	break;
case 4:
	System.out.println("four");
	break;
case 5:
	System.out.println("five");
	break;
default:
	System.out.println("in valied choice");
}
}
}