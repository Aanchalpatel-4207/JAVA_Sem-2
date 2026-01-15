class MultiThread1 implements Runnable
{
	public void run()
	{
		for (int i=1;i<=5;i++) 
		{
			System.out.println("Good Morning");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
class MultiThread2 implements Runnable
{
	public void run()
	{
		for (int i=1;i<=5;i++) 
		{
			System.out.println("Good Afternoon");
			try
			{
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}	
		}
	}
}
public class lab11_2 
{
	public static void main(String[] args) 
	{
		MultiThread1 mth1=new MultiThread1();
		MultiThread2 mth2=new MultiThread2();
		Thread t1=new Thread(mth1);
		Thread t2=new Thread(mth2);
		t1.start();
		t2.start();
	}	
}