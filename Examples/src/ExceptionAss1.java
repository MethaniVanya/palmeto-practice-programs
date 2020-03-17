import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionAss1 {
	public static void main(String arg[])
	{
		Scanner c = new Scanner(System.in);
		System.out.println("enter a string");
		String s=c.nextLine();
		int x= Integer.parseInt(s);
	try
	{
		int a=x*x;
		System.out.println(a);
	}

	catch(InputMismatchException e)
	{
		System.out.println("Entered input is not a valid format for an valid formate");
	}
   }
}
