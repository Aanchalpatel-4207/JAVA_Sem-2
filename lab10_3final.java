import java.util.Scanner;
class DarshanUni extends Exception
{
	DarshanUni(String massage)
	{
		super(massage);
	}
}
public class lab10_3final
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.next();
		try
		{
			if(str.equals ("Darshan"))
			{
				throw new Exception("Welcome to Darshan University");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
}