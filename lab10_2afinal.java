import java.util.Scanner;
class Account
{
	int balance=5000;
	int accNum;
	String userName;
	Account(int accNum,String userName)
	{
		this.balance=500;
		this.accNum=accNum;
		this.userName=userName;
	}
	void diposit()
	{
		System.out.println("Total Balance:"+currentBalance);
	}
	void withdraw() throws Exception 
	{
		double temp = balance-withdraw;
		try
		{
			if(temp<500)
			{
				throw new Exception("Balance must be greater than 500:");
			}
			else
			{

			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Total Balance:"+balance);
		}
	}
}
public class lab10_2afinal 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Number:");
		int accNum=sc.nextInt();
		System.out.println("Enter User Name:");
		String userName=sc.next();
		Account a1=new Account(accNum,userName);
		a1.diposit(1000);
		a1.withdraw(500);	

	}	
}