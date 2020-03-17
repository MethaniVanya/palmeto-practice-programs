class MyRun implements Runnable
{
	public void run()
	{
		for(int i=101;i<200;i++)
			System.out.println(i);
	}
}
public class RunnableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Runnable r=()->{
    	   for(int i=101;i<=200;i++)
    		   System.out.println(i);
       };
       Thread t=new Thread(r);
       t.start();
	}

}
