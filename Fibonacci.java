public class Fibonacci{
public static void main (String args[])
{
	int n=10,sum=0,a=0,b=1;
	for (int i=0;i<=n;++i){
			System.out.println("The fibonacci series is :"+sum);

		sum=a+b;
		a=b;
		b=sum;
	}
	}
	}
	