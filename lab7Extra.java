import java.util.Scanner;
class Cube
{
	double height;
	double width;
	double depth;
	void setter(double height,double width,double depth)
	{
		this.height=height;
		this.width=width;
		this.depth=depth;
	}
	void getter()
	{
		System.out.println("height:"+height);
		System.out.println("width:"+width);
		System.out.println("depth:"+depth);
	}

	
	void volume()
	{
		System.out.println("volume:"+(height*width*depth));
	}	
}
public class lab7Extra 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a height:");
		double height1=sc.nextDouble();
		System.out.println("Enter a width:");
		double width1=sc.nextDouble();
		System.out.println("Enter a depth:");
		double depth1=sc.nextDouble();
		Cube c1=new Cube();
		c1.setter(height1,width1,depth1);	
		c1.getter();
		c1.volume();

		System.out.println("Enter a height:");
		double height2=sc.nextDouble();
		System.out.println("Enter a width:");
		double width2=sc.nextDouble();
		System.out.println("Enter a depth:");
		double depth2=sc.nextDouble();
		Cube c2=new Cube();
		c2.setter(height2,width2,depth2);	
		c2.getter();
		c2.volume();
	}
}