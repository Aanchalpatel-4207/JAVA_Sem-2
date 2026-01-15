import java.util.Scanner;
public class lab3_7
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of range:");
		int r1=sc.nextInt();
		int r2=sc.nextInt();
		lab3_7 p=new lab3_7();
		for(int i=r1; i<=r2; i++)
		{
			if(p.lab3_7(i))
			{
				System.out.println(i);
			}
		}
	}
	public boolean lab3_7(int n)
	{		
		for(int i=2 ; i<n ; i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	
}