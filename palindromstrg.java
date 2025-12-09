import java.util.*;
public class palindromstrg{
public static void main(String args[]){
String word,rev="";//OBJECT OF STRING CLASS
Scanner ip=new Scanner(System.in);
System.out.println("enter your string: ");
word=ip.nextLine();
int len=word.length();
for(int i=len-1;i>=0;i--)
{rev+=word.charAt(i);}
if(word.equals(rev))
{System.out.println("it is palinedrome String");}
else
{System.out.println("it is not palinedrome String");}
}}