package Aunty;

public class amazon
{
	static void submit() throws AmazonException
	{
		int amt= 1000;
		if(amt>=5000)
		{
			System.out.println("offers");
		}
		else
		{
			throw new AmazonException("pant illaI");
		}
	}
	

	public static void main(String[] args) 
	{
		try
		{
			submit();
			
		}
		catch(AmazonException e)
		{
			System.out.println(e.get());
		}
		
		// TODO Auto-generated method stub

	}

}
class AmazonException extends Exception
{
	String msg;
	AmazonException(String msg)
	{
		this.msg=msg;
	}
	public String get()
	{
		return msg;
	}
}
