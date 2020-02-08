//method overriding  
class P
{
void run(){
System.out.println("Parent Method");
}
}
class C extends P{
void run(){
System.out.println("Child Method");
}
}
class Main{
public static void main(String args[]){
P p=new P();
C c=new C();
p.run();
c.run(); 


}
}
