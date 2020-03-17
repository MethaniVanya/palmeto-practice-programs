import java.util.Scanner;
public class ExceptionAss2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of array");
		int n= s.nextInt();
		int a[]=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter indext of array element");
		int i=s.nextInt();
		try
		{
			System.out.println("array element is"+a[i]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		}

}
