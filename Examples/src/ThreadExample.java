class MyThreads extends Thread{
	public void run()
	{
		System.out.println("thread execution begins");
		for(int i=100;i<=200;i++)
			System.out.println(i);
			System.out.println("end of thread execution0");
	}
}
public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyThreads t=new MyThreads();
       System.out.println("main strts");
	  t.start();
	for(int j=1;j<=100;j++)
		System.out.println(j);
	System.out.println("main completed");
	System.out.println("thread priority"+t.getPriority());
	}
	

}
