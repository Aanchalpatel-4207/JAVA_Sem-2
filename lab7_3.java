import java.util.Scanner;

class Member
{
	String name;
	int age;
	int phoneNum;
	String address;
	double salary;

	Member(String name,int age,int phoneNum,String address,double salary)
	{
		this.name=name;
		this.age=age;
		this.phoneNum=phoneNum;
		this.address=address;
		this.salary=salary;
	}
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Phone Number:"+phoneNum);
		System.out.println("Address:"+address);
		System.out.println("Salary:"+salary);
	}
	void printSalary()
	{
		System.out.println("SALARY:"+salary);
	}	
}
class Employee extends Member
{
	String specialization;
	Employee(String name,int age,int phoneNum,String address,double salary,String specialization)
	{
		super(name,age,phoneNum,address,salary);
		this.specialization=specialization;
	}
	void displayspe()
	{
		super.display();
		System.out.println("specialization:"+specialization);
	}
}
class Manager extends Member
{
	String department;
	Manager(String name,int age,int phoneNum,String address,double salary,String department)
	{
		super(name,age,phoneNum,address,salary);
		this.department=department;
	}
	void displaydepa()
	{
		super.display();
		System.out.println("department:"+department);
	}	
}

public class lab7_3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.next();
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		System.out.println("Enter your phoneNum:");
		int phoneNum=sc.nextInt();
		System.out.println("Enter your Address:");
		String address=sc.next();
		System.out.println("Enter your salary:");
		double salary=sc.nextDouble();
		System.out.println("Enter your specialization:");
		String specialization=sc.next();
		System.out.println("Enter your department:");
		String department=sc.next();

		Employee e1=new Employee(name,age,phoneNum,address,salary,specialization);
		e1.displayspe();
		e1.printSalary();
		Manager m1=new Manager(name,age,phoneNum,address,salary,department);
		m1.displaydepa();
		m1.printSalary();
	}
}