import java.util.*;
import java.lang.*; //default package
class UsingScanner
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a,b;
System.out.println("Enter first number ");
a=s.nextInt();
System.out.println("Enter second number ");
b=s.nextInt();
int c =a+b;
System.out.println("The sum is : "+c);
}
}