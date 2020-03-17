import java.util.Scanner;
public class JavaMcq5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s=new Scanner(System.in);
 System.out.println("enter a number");
 int n= s.nextInt();
 int sum=0,n1,i=0,c=0;
 while(n!=0)
 {
	 n1=n%10;
	 sum=(sum*10)+n1;
	 if(n1==0&&i==0)
		 c++;
		 else
			 i=1;
	 n=n/10;
 }
 
 System.out.println("reverse of number is");
 for(int j=0;j<c;j++)
	 System.out.println("0");
 System.out.println(sum);
	}

}
