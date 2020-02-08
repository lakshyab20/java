import java.util.Scanner;
class B
{
	public static void main(String[] args)
	{
	
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a integer");
		int n = scan.nextInt();
		if(n%2==0)
		{
			System.out.println("the number is even");
		}
		else
			
		System.out.println("odd");
	}
}