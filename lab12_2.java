import java.io.*;
public class lab12_2 
{
	public static void main(String[] args) 
	{
		try
		{
			FileWriter a= new FileWriter("lab12_2b.txt");
			Scanner sc = new Scanner (new File("lab12_2a.txt"));
			while(sc.hasNextLine)
			{
				String s=sc.nextLine();
				s.replaceAll("Girl","Boy");
				lab12_2b.append(lab12_2b);
			}
			lab12_2a.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
	}	
}