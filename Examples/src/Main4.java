import java.util.Scanner;

public class Main4 {

	public static void main(String[] args)
	{   // TODO Auto-generated method stub
     Scanner scanner =new Scanner (System.in);
    System.out.println("enter array size");
    int k=scanner.nextInt();
    System.out.println("enter array elements");
    int a[]=new int[10];
     for(int i=0;i<k;i++)
     {
    	 a[i]=scanner.nextInt();
	}
     System.out.println("enter search element");
     int n =scanner.nextInt();
     System.out.println(UseMainCode4.findElement(a,n));
	}
}
