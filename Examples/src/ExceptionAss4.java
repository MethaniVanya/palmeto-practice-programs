import java.util.Scanner;

public class ExceptionAss4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value");
		int a= s.nextInt();
		System.out.println("enter b value");
		int b=s.nextInt();
		ExceptionAss4 e=new ExceptionAss4();
		e.division(a,b);
	 //new ExceptionAss4().division(a,b);
	}
	   public void division(int a,int b)
	   {
		try
		{
			int c=a/b;
			System.out.println(c);
		}
	   catch(ArithmeticException e)
	   {
		   System.out.println("divisio is 0");
	   }

	}

}
