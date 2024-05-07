package Aunty;

public class sample5 {

	public static void main(String[] args) 
	{
		System.out.println("main starts");
		try
		{
			int i=1/10;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("handled");
		}
		   catch(ArithmeticException e)
		{
			   System.out.println("its caught");
		}
		System.out.println("main ends");
		// TODO Auto-generated method stub

	}

}
