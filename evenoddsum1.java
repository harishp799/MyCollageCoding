import java.util.*;
public class evenoddsum1{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
int num=sc.nextInt();
int c=0,sum1=0,sum2=0;
while (num>0){
 c+=1;
 if (c%2!=0)
 	sum1+=num%10;
 else
	sum2+=num%10;
num=num/10;
}
System.out.println("sum of even place digits is "+sum2);
System.out.println("sum of odd place digits is "+sum1);
}}