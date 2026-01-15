interface A
{
	final int i=100;
	public void displayA();
}
interface A1 extends A
{
	final int j=200;
	public void displayA1();	
}
interface A2 extends A
{
	final int k=300;
	public void displayA2();
}
interface A12 extends A1,A2
{
	final int l=400;
	public void displayA12();
}
class B implements A12
{
	public void displayA()
	{
		System.out.println("A:"+i);
	}
	public void displayA1()
	{
		System.out.println("A1:"+j);
	}
	public void displayA2()
	{
		System.out.println("A2:"+k);
	}
	public void displayA12()
	{
		System.out.println("A12:"+l);
	}	
}
public class lab8_2
{
	public static void main(String[] args) 
	{
		B b1=new B();
		b1.displayA();
		b1.displayA1();
		b1.displayA2();
		b1.displayA12();	
	}
}