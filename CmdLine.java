import java.util.*;
import java.lang.*;
class CmdLine{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String a;
int b;
int c;
System.out.println("Enter username: ");
a=s.nextLine();
System.out.println("Enter Account no: ");
b=s.nextInt();
System.out.println("Account balance in account no :");
c=s.nextInt();
System.out.println("Username: "+ a);
System.out.println("Account no: "+ b);
System.out.println("Account balance is  "+c);
}
}