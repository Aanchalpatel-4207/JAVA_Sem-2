import java.io.*;
public class lab12_1 
{
	public static void main(String[] args) 
	{
		try
		{
			BufferedReader bf=new BufferedReader(new FileReader("./lab12_1.txt"));
			String line=" ";
			int word=0;
			int lineNo=0;
			int ch=0;
			while((line=bf.readLine())!= null)
			{
				lineNo++;
				String[] words=line.split(" ");
				word+=words.length;
				for(int i=0;i<words.length;i++)
				{
					ch+=words[i].length();
				}
			}
			bf.close();
			System.out.println("Number of words:"+word);
			System.out.println(lineNo);
			System.out.println("Number of Character:"+ch);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
	}	
}