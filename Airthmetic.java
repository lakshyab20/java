//wap in java that takes two numeric value from user and perform aorthmetyic op

import java.util.*;
import java.lang.*;

class Airthmetic
{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
double a,b;
System.out.println("Enter First number: ");
a=s.nextDouble();
System.out.println("Enter Second number: ");
b=s.nextDouble();
System.out.println("Sum is :" +(a+b));
System.out.println("Subtraction is : "+(a-b));
System.out.println("Product is : "+(a*b));
System.out.println("Division is :"+(b/a));
}
}
