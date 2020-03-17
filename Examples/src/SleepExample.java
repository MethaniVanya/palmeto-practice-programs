class SleepThread extends Thread

{
	public void run()
	{
		try {
			System.out.println(this.getState());
		for(int i=101;i<=200;i++)
		{
			System.out.println(i);
		  this.sleep(1000);
		}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
	}
	
	
}
	public class SleepExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            SleepThread t=new SleepThread();
            t.start();
            System.out.println(t.getState());
            for(int i=1;i<=100;i++)
            	System.out.println(i);
            System.out.println(t.getState());
	}

}
