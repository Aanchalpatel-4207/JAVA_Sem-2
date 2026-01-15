import java.util.Scanner;
public class lab3_1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first subject's mark:");
		int a=sc.nextInt();
		System.out.println("Enter second subject's mark:");
		int b=sc.nextInt();
		System.out.println("Enter third subject's mark:");
		int c=sc.nextInt();
		System.out.println("Enter fourth subject's mark:");
		int d=sc.nextInt();
		System.out.println("Enter fifth subject's mark:");
		int e=sc.nextInt();	
		int per=a+b+c+d+e/5;
		System.out.println("per="+per);
		if(per>=60)
		{
			System.out.println("First Division");
		}
		else if(per>50 && per<=59)
		{
			System.out.println("Second Division");
		}
		else if(per>40 && per<=49)
		{
			System.out.println("Third Division");
		}
		else if(per<40)
		{
			System.out.println("Fail");
		}
	}
}