//wap in java that takes radius as a input from user and print area and circumference through scanner

import java.util.*;
import java.lang.*;

class Circle{
public static void main (String args[]){
Scanner s= new Scanner (System.in);
double r,area,circumference;
System.out.println("Enter radius");
r=s.nextDouble();
area=3.14*r*r;
System.out.println("Area of the circle is: "+area);
circumference=2*3.14*r;
System.out.println("Circumference of the circle is : "+circumference);
}
}
