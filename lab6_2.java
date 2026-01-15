import java.util.Scanner;
class Time
{
	int hr;
	int min;
	int sec;
	Time(int hr,int min,int sec)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
	void calTime(int hr,int min,int sec)
	{
		int h=this.hr+hr;
		int m=this.min+min;
		int s=this.sec+sec;
	}
}
public class lab6_2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Time t1=new Time();
		System.out.println("Enter a vlaue of hour:");
		int hr=nextInt();
		System.out.println("Enter a vlaue of minute:");
		int min=nextInt();
		System.out.println("Enter a vlaue of second:");
		int sec=nextInt();
		Time=new Time(int hr,int min,int sec);

		Time t2=new Time();
		System.out.println("Enter a vlaue of hour:");
		int hr=nextInt();
		System.out.println("Enter a vlaue of minute:");
		int min=nextInt();
		System.out.println("Enter a vlaue of second:");
		int sec=nextInt();
		Time=new Time(int hr,int min,int sec);

		t1.calTime();
		t2.calTime();
	}
}