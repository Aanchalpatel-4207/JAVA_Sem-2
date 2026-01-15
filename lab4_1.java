import java.util.Scanner;
public class lab4_1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		
		int ccount=0;
		int vcount=0;
		for (int i=0; i<s.length() ;i++) 
		{
			char c=s.charAt(i);
			if(c =='a'||c =='e'||c =='i'||c =='o'|| c =='u')
			{
				vcount++;
				System.out.println("this Character is vowel"+c);
			}
			else
			{
				ccount++;
				System.out.println("this Character is consonant"+c);
			}
		}
		System.out.println("vowel"+(vcount));
		System.out.println("consonant"+(ccount));
	}
}