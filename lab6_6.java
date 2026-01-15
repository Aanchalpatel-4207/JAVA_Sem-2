class Count
{
	static int count=0;
	Count()
	{
		count++;
	}
}
public class lab6_6
{
	public static void main(String[] args) 
	{
		Count c1=new Count();
		Count c2=new Count();
		Count c3=new Count();
		Count c4=new Count();
		Count c5=new Count();
		Count c6=new Count();
		Count c7=new Count();
		Count c8=new Count();
		Count c9=new Count();
		Count c10=new Count();
		System.out.println("Count="+Count.count);
	}
}