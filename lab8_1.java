import java.util.Scanner;
abstract class Vegetable
{
	String Name;
	String Color;

	abstract public String toString();
}
class Potato extends Vegetable
{
	Potato(String Name,String Color)
	{
		super.Name=Name;
		super.Color=Color;
	}
	public String toString()
	{
		return super.Name+super.Color;
	}
}
class Bringal extends Vegetable
{
	Bringal(String Name,String Color)
	{
		super.Name=Name;
		super.Color=Color;
	}
	public String toString()
	{
		return super.Name+super.Color;
	}
}
class Tomato extends Vegetable
{
	Tomato(String Name,String Color)
	{
		super.Name=Name;
		super.Color=Color;
	}
	public String toString()
	{
		return super.Name+super.Color;
	}	
}
public class lab8_1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name of Vegetable:");
		String Name=sc.next();
		System.out.println("Enter a Color:");
		String Color=sc.next();
		Potato p1=new Potato(Name,Color);
		System.out.println(p1.toString());
		Bringal b1=new Bringal(Name,Color);
		System.out.println(b1.toString());
		Tomato t1=new Tomato(Name,Color);
		System.out.println(t1.toString());	
	}	
}