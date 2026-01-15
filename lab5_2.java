import java.util.Scanner;
public class lab5_2
{
public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int a = sc.nextInt();

		for(int i=0;i<=a;i++)
		{
			for(int k=1;k<=a-i;k++)
			{
				System.out.print(" ");
			}
				for(int j=1;j<=i;j++)
				{
					System.out.print(" *");
				}
			System.out.println("\n");
		}

		for(int i=a-1;i>=1;i--)
		{
			for(int k=1;k<=a-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println("\n");
		}
	}
}	