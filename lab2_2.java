import java.util.Scanner;
public class lab2_2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a opration:");
		String s1=sc.nextLine();
		if(s1.equals("+"))
		{
			System.out.println(+a+"+"+b+"="+(a+b));
		}
		else if(s1.equals("-"))
		{
			System.out.println(+a+"-"+b+"="+(a-b));
		}
		else if(s1.equals("*"))
		{
			System.out.println(+a+"*"+b+"="+(a*b));
		}
		else if(s1.equals("/"))
		{
			System.out.println(+a+"/"+b+"="+(a/b));
		}
		else if(s1.equals("%"))
		{
			System.out.println(+a+"%"+b+"="+(a%b));
		}
		else 
		{
			System.out.println("Invalid Input");
		}
	}
}