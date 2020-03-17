import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("enter array 1 size");
		int k1=s.nextInt();
		int a[]=new int[k1];
		System.out.println("enetr array1 elements");
		
		for(int i=0;i<k1;i++)
	     {
	    	 a[i]=s.nextInt();
		}
		System.out.println("enter array 2 size");
		int k2=s.nextInt();
		int b[]=new int[k2];
		System.out.println("enetr array2 elements");
	
		for(int j=0;j<k2;j++)
	     {
	    	 b[j]=s.nextInt();
		}
	System.out.println(UseMainCode6.commonArray(a,b));
	}

}
