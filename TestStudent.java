import java.util.*;
import java.lang.*;
class Student{
int rollno;
String name;
double marks;
public void setData(int r,String n,double m)
	{
		rollno=r;
		name=n;
		marks=m;
	}
	public void getData()
	{
		System.out.println("Roll number of student is: "+rollno);
		System.out.println("Name of student is: "+name);
		System.out.println("Marks of student is: "+marks);
	}
}
class TestStudent{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a;
		String r;
		double b;
		r=s.nextLine();
		b=s.nextDouble();
		a=s.nextInt();
		
		Student s1=new Student();
		s1.setData(a,r,b);
		s1.getData();
	}
}
		
	
			
		