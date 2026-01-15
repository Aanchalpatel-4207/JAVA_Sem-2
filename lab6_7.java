class Student
{
	int a;
	static int b;
	Student(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void display()
	{
		System.out.println("Variable a="+a);
		System.out.println("Variable b="+b);
		System.out.println("Variable a="+this.a);
		System.out.println("Variable b="+this.b);
	}
}
public class lab6_7
{
	public static void main(String[] args) 
	{
		Student s1=new Student(10,20);
		s1.display();
	}
}