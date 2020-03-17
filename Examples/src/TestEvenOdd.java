import java.util.Scanner;
public class TestEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n;
   Scanner s= new Scanner(System.in);
   System.out.println("enter a number");
   n=s.nextInt();
   EvenOdd eo= new EvenOdd();
     try
     {
    	 eo.testnum(n);
     }
     catch(EvenException e)
     {
    	 System.out.println(e);
     }
     catch(OddException e)
     {
    	 System.out.println(e);
     }
	}

}
