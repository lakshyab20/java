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
		Student s1=new Student();
		s1.setdata(20,"Lakshya",9.8);
		s1.getdata();
	}
}
		
	
			
		