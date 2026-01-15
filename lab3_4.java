import java.util.Scanner;
public class lab3_4
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		boolean flag=true;
		for(int i=2 ; i<n ; i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
			else{
				flag=true;
			}
		}
		if(flag)
		{
			System.out.println(n+" is prime");
		}
		else
		{
			System.out.println(n+" is composite");
		}
	}
}