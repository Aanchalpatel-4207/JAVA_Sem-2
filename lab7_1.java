import java.util.Scanner;
class Student
{
	int id_no;
	int no_of_subjects_registered;
	String[] subject_code;
	int[] subject_credits;
	String[] grade_obtained;
	double spi;

	public Student(int id_no,int no_of_subjects_registered,String[] subject_code,int[] subject_credits,String[] grade_obtained)
	{
		this.id_no = id_no;
		this.no_of_subjects_registered = no_of_subjects_registered;
		this.subject_code = subject_code;
		this.subject_credits = subject_credits;
		this.grade_obtained = grade_obtained;
	}

	public void spi()
	{
		int pointGain=0;
		int totalCredit=0;

		for(int i=0;i<no_of_subjects_registered;i++)
		{
			if(grade_obtained[i].equals("A"))
			{
				pointGain+=subject_credits[i]*10;
			}
			else if(grade_obtained[i].equals("B"))
			{
				pointGain+=subject_credits[i]*9;
			}
			else if(grade_obtained[i].equals("C"))
			{
				pointGain+=subject_credits[i]*8;
			}
			else if(grade_obtained[i].equals("D"))
			{
				pointGain+=subject_credits[i]*7;
			}
			else if(grade_obtained[i].equals("E"))
			{
				pointGain+=subject_credits[i]*6;
			}
			else if(grade_obtained[i].equals("F"))
			{
				pointGain+=subject_credits[i]*5;
			}
			totalCredit+=subject_credits[i];
		}
		spi=pointGain/totalCredit;
		System.out.println("spi="+spi);
	}
}

public class Lab7_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student no=");
		int size = sc.nextInt();
		Student s=new Student[size];

		for(int i=0;i<size;i++)
		{

			System.out.println("enter student id no=");
		int  i1 = sc.nextInt();
		System.out.println("enter no_of_subjects_registered="); 
		int  n1 = sc.nextInt();
		String [] sub_ccode=new String[n1];
		int[] sub_cre = new int[n1];
		String [] gra_ob = new String[n1];
		for(int i=0;i<n1;i++)
		{
			System.out.println("enter subject_code=");
			sub_ccode[i]= sc.next();
			System.out.println("enter subject_credits=");
			sub_cre[i] = sc.nextInt();	
			System.out.println("enter grade_obtained=");
			gra_ob[i] = sc.next();
		}
		s[i]=new Student(i1,n1,sub_ccode,sub_cre,gra_ob);

		}

		for(int i=0;i<size;i++){

			s[i].spi();
		}
		
		
		
	}
}