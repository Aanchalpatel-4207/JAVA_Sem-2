import java.util.Scanner;

public class lab2_4
{
public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int f = sc.nextInt();
		System.out.println("fahrenheit to celsius"+(c*9/5)+32);
		System.out.println("celsius to fahrenheit"+(f-32)*5/9);
	}
}