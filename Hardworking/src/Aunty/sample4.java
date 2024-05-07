package Aunty;

public class sample4 {

	public static void main(String[] args) 
	{
		System.out.println("main starts");
		String s1="amma";
		try
		{
			System.out.println(s1.charAt(8));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("handled");
		}
		System.out.println("main ends");
		
		
		// TODO Auto-generated method stub

	}
	

}
