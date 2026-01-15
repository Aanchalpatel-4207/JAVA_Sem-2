//final//
 class A
{
	int a=10;
	final void display()
	{
		System.out.println("A="+a);
	}	
}
class B extends A
{
	B()
	{
		super.a=20;
	}
	void display()
	{
		System.out.println("A="+a);
	}
}
public class lab7a_4
{
	public static void main(String[] args) 
	{
		B b1=new B();
		b1.display();	
	}	
}