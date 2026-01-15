import java.util.Scanner;
class Account
{
	int accNum;
	String accType;
	double balance;

	void setter(int accNum,String accType,double balance)
	{
		this.accNum=accNum;
		this.accType=accType;
		this.balance=balance;
	}

	void getter()
	{
		System.out.println("Account Number:"+accNum);
		System.out.println("Account Type:"+accType);
		System.out.println("Account Balance:"+balance);
	}	
}
public class BankDemo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Account a1=new Account();
			System.out.println("Enter a Account Number:");
			int accNum1=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter a Account Type:");
			String accType1=sc.nextLine();
			System.out.println("Enter a Account Balance:");
			double balance1=sc.nextDouble();
			a1.setter(accNum1,accType1,balance1);	
			a1.getter();

		Account a2=new Account();
			System.out.println("Enter a Account Number:");
			int accNum2=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter a Account Type:");
			String accType2=sc.nextLine();
			System.out.println("Enter a Account Balance:");
			double balance2=sc.nextDouble();
			a2.setter(accNum2,accType2,balance2);	
			a2.getter();

		Account a3=new Account();
			System.out.println("Enter a Account Number:");
			int accNum3=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter a Account Type:");
			String accType3=sc.nextLine();
			System.out.println("Enter a Account Balance:");
			double balance3=sc.nextDouble();
			a1.setter(accNum3,accType3,balance3);	
			a1.getter();
		
	}	
}