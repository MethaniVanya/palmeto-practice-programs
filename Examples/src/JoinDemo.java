class HelloThread extends Thread
{
	public void run()
	{
		for(int i=1;i<10;i++)
			System.out.println("hello ");
		try
		{
			sleep(0);
		}
		catch(Exception e) 
		{
			
		}
	}
}
public class JoinDemo 
{
  public JoinDemo()
  {
	  
  }
	public static void main(String args[])throws Exception
	{
		HelloThread h1=new HelloThread();
		h1.start();
		//h1.join();
		
		//h1.yield();
		for(int i=1;i<10;i++)
			System.out.println("main");
	}
}

