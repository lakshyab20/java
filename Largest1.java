//wap to find the largest of three numbers using scanner
import java.util.*;
import java.lang.*;

class Largest1{
public static void main (String args[]){
Scanner s= new Scanner (System.in);
int a,b,c;
System.out.println("Enter the numbers: ");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
if (a>b&&a>c){
System.out.println("a is the largest of the three numbers");}
else if (b>a&&b>c){
	
System.out.println("b is the largest of the three numbers");}
else
	System.out.println("c is the largest of the three numbers");
	}
	}