import java.util.Scanner;
class A
	{
		double h1;
		A(double h1)
		{
			this.h1=h1;
		}
		void display()
		{
			System.out.println("H:"+h1);
		}
	}
	class B extends A
		{
			double w1;
			double d1;
			B(double h1,double w1,double d1)
			{
				super(h1);
				this.w1=w1;
				this.d1=d1;
				System.out.println("H:"+super.h1);
			}
			void display()
			{
				super.display();
				System.out.println("W:"+w1);
				System.out.println("D:"+d1);
			}
			void add()
			{
				System.out.println("Sum:"+(h1+w1+d1));
			}
		}	
public class lab7_4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter h:");
		double h1=sc.nextDouble();
		System.out.println("Enter w:");
		double w1=sc.nextDouble();
		System.out.println("Enter d:");
		double d1=sc.nextDouble();
		B b1=new B(h1,w1,d1);
		b1.display();
		b1.add();
	}	
}