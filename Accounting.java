class account//example for object and class creation and using
{
int acno;
String name;
double amount;
void insert(int a,String n,double am)
{
acno=a;
name=n;
amount=am;
}
void display()
{
System.out.println(acno+": "+name+": "+amount);
}
void check()
{
System.out.println("your blance is :"+amount);
}
void credit(int x)
{
amount+=x;
System.out.println(x+"  is creadited");
}
void debit(int y)
{
int z=y;
if(amount>y)
{
amount-=y;
System.out.println(y+"  is debited");
}
else
{
System.out.println("sorry ! you have insafficent balance ");
}
}
}
public class Accounting
{
public static void main(String args[])
{
account obj=new account();
obj.insert(10324,"harish",1000.0);
obj.display();
obj.check();
obj.credit(4000);
obj.check();
obj.debit(2000);
obj.check();
}
}


