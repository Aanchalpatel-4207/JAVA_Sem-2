public class lab10_1
{
	public static void main(String[] args) 
	{
		try
		{
			int result = 10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException: cannot divide by zero!");
		}
		try
		{
			int[] numbers = {1,2,3};
			System.out.println(numbers[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException: Index is out of bounds!");
		}
	}	
}