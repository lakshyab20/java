class RBI{
void rate_of_interest(){
System.out.println("8%");
}
}
class SBI extends RBI {
	void rate_of_interest(){
SBI s=new SBI();
s.rate_of_interest();
	}
}
class PNB extends RBI{
void rate_of_interest(){
System.out.println("7%");
}
PNB p=new PNB();
}
class Main1{
public static void main(String args[]){
PNB p=new PNB();
p.rate_of_interest();
RBI r= new RBI();
r.rate_of_interest();
SBI s=new SBI();
s.rate_of_interest();
}
}
