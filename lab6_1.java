import java.util.Scanner;
class Circle
{
	double radius;
	void radius(double radius)
	{
		this.radius=radius; 
	}
	void area()
	{
		System.out.println(3.14*radius*radius);
	}

}
public class lab6_1
{
	public static void main(String[] args) 
	{
		Circle c1=new Circle();

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value of radius:");
		double radius=sc.nextDouble();
		c1.radius(radius);
		c1.area();
	}
}