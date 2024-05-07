package Aunty;

public class sample3 {

	public static void main(String[] args)
	{
		System.out.println("main starts");
		sample s1=new sample();
		s1=null;
		try
		{
			
			System.out.println("s1.hashcode()");
			
		}
		catch(NullPointerException e)
		{
			System.out.println("handled");
			
		}
		System.out.println("main ends");
		// TODO Auto-generated method stub

	}

}
