
public class ExceptionAss3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /* Scanner s= new Scanner(System.in);
     System.out.println("enter array size");
     int n= s.nextInt();
     int a[]=new int[n];
     System.out.println("enter array elements");
     for(int i=0;i<n;i++)
     {
    	a[i]=s.nextInt();
     }*/
     try
     {
    	 int sum=0,avg=0;
    	 for(int i=0;i<args.length;i++)
    		sum=sum+Integer.parseInt(args[i]);
    	 avg=sum/args.length;
    	  System.out.println("sum is"+sum);
    	  System.out.println(avg);
     }
     catch(NumberFormatException e)
     {
    	 System.out.println("unsucesfull");
     }
	}

}
