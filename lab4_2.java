import java.util.Scanner;
public class lab4_2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[4];
		int sum=0;
		double avg=0;
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the value of arry:");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		avg=sum/4;
		System.out.println("avg="+avg);
	}

}