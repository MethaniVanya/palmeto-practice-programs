import java.util.Scanner;
public class SumofOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
    System.out.println("enetr number");
     int n=s.nextInt();
     int n1,sum=0;
     while(n!=0) 
     {
    	 n1=n%10;
         if(n1%2==0)
         {
        	 sum=sum+(n1*n1);
         }
         n=n/10;
        }

     System.out.println("sumof even square is"+sum);
}
}
