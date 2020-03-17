public class UserMain 
{
	
	public static int checkSum(int n)
	{
		int n1,n2=0,n3;
		while(n!=0)
		{
			n1=n%10;
			if((n2=n1%2)!=0)
			
				n2=n2+n1;
			
			n=n/10;
		}
		if(n2%2==0)
			n3=-1;
		else 
			n3=1;
		return n3;
	}
   public static void main(String args[])
   {
	   int n=2311;
	   System.out.println(checkSum(n));
   }

}

