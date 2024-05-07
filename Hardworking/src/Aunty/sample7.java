package Aunty;

public class sample7 {

	public static void main(String[] args) 
	{
		System.out.println("main starts");
		try
		{
			int i =1/0;
			
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("handled");
		}
		finally
		{
			System.out.println("hey im finally");
		}
		System.out.println("main ends");+
		// TODO Auto-generated method stub

	}

}
