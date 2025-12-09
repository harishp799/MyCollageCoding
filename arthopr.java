import java.util.Scanner;
public class arthopr
{
public static void main(String[] args)
{Scanner in=new Scanner(System.in);
System.out.println("enter two numbers:");
int a=in.nextInt(0);
int b=in.nextInt(1);
double r1,r2,r3,r4,r5;
	/*int r1 = a+b;
	int r2 = a-b;
	int r3 = a*b;
	int r4 = a/b;
	int r5 = a%b;*/
System.out.println("sum is " + "/n" +(r1=(a+b)));
System.out.println("sub is/n " +(r2=(a-b)));
System.out.println("multiplication is /n " + (r3=(a*b)));
System.out.println("qoeficent is /n " + (r4=(a/b)));
System.out.println("reminder is " + (r5=(a%b)));
}
}