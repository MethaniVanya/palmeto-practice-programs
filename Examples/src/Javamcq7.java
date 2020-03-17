
	import java.util.Arrays;
	import java.util.Scanner;
	public class Javamcq7
	{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a integer value");
	int n=s.nextInt();
	System.out.println("Enter elements into array");
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
	a[i]=s.nextInt();
	}
	Arrays.sort(a);
	int n1=a[a.length-1]-a[0];
	int b=a.length;
	if(b==1)
	System.out.println("array elements are "+b);
	else
	System.out.println("difference is "+n1);
	}
	}

