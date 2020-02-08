import java.util.*;

public class EmailApp{
	public static void main (String args[]){
		Email em1 = new Email("Lakshya","Bhardwaj");
		System.out.println(em1.showInfo());
	}
}
	
class Email{
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxcapacity=500;
	private int defaultPasswordLength=10;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";
	
	public Email(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
		
		this.department=setDepartment();
		
		
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("Your password is :"+this.password);
		
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		
	}
	
	private String setDepartment(){
		System.out.println("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
		Scanner s=new Scanner(System.in);
		int depChoice=s.nextInt();
		if (depChoice==1) {return "sales";}
		else if (depChoice==2) {return "development";}
		else if (depChoice==3) {return "accounting";}
		else {return "";}
	}
	private String randomPassword(int length){
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i=0;i<length;i++){
			int rand = (int) (Math.random()* passwordSet.length());
			password[i]=passwordSet.charAt(rand);
			
		}
		return new String(password);
	}
	public void setMailboxCapacity(int capacity){
		this.mailboxcapacity=capacity;
	}
	public void setAlternateEmail(String altEmail){
		this.alternateEmail=altEmail;
	}
	public void changePassword(String password){
		this.password=password;
	}
	public int getMailboxCapacity(){return mailboxcapacity;}
	public String getAlternateEmail(){return alternateEmail;}
	public String getPassword(){return password;}
	
	public String showInfo(){
		return "DISPLAY NAME: " +firstName+" "+lastName+"\n"+
				"COMPANY EMAIL: "+email + "\n"+
				"MAILBOX CAPACITY: "+mailboxcapacity+"mb";
	}
}
	