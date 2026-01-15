import java.util.Scanner;
class MyArrMeth
{
	void displayArr(int[]a)//meth-1
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]:"+a[i]);
		}
	}//meth-1


	int[] bubbleSort(int[]a)//meth-2
	{
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[i]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}//meth-2


	int searchArr(int[]a,int ele)//meth-3
	{
		int i=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==ele)
			{
				return i;
			}
		}
		return -1;
	}//meth-3


	int sumArr(int[] a)//meth-4
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum += a[i];
		}
		return sum;
	}//meth-4


	int avgArr(int[]a)//meth-5
	{
		int sum= sumArr(a);
		return (double)sum/a.length;
	}//meth-5
}
public class Array
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter a[i]:");
			a[i]=sc.nextInt();
		}
		
		MyArrMeth am=new MyArrMeth();

		//call meth-1
		am.displayArr(a);//meth-1

		//call meth-2
		am.bubbleSort(a);//call meth-2
		System.out.println("After sorting:");
		am.displayArr(a);//call meth-1

		//search
		System.out.println("Enter a element search:");
		int ele=sc.nextInt();
		int index=am.searchArr(a,ele);//call meth-3
		System.out.println(ele+"found at index:"+index);
		int sum=am.sumArr(a);//call meth-4

		double avg=am.avgArr(a);
		System.out.println("Average of all element:"+avg);
	}
}

