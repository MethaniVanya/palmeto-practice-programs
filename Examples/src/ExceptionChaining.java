class Test
{
	public int f1()
	{
		int a=10,b=5;
		int c=a/b;
		return c;
	}
	public void f2()
	{
		int y=f1();
	}
}
public class ExceptionChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Test t=new Test();
		try
		{
			t.f2();
		}
		catch(Exception e)
		{
			System.out.println("denominator 0");
		}
	}

}
