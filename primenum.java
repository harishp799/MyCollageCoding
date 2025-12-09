import java.util.Scanner;
public class primenum
{
public static void main(String args[])
{
Scanner ip=new Scanner(System.in);
System.out.println("enter how many prime numbers do want to print:");
int n=ip.nextInt();
prime(n);
}
public static void prime(int n)
{
int k,j,l=0;
//{for( int i=1;i<=n;i++)
//while(l<=n)
//{
   outer:
   for(j=1;;j++)
   {
      int c=0;
        for(k=1;k<=j;k++)
        { 
           if(j%k==0)
            c=c+1;
         }
      if(c==2)
      {
       System.out.print( j  + " ");
       l+=1;
       if(l==n)
       break outer;
      }
    }
}
}

