
public class UserMainCode {
	public static int checkSum(int n)
	{
		int sum=0,rem;
		while(n>0)
		{
			rem=n%10;
			sum=rem+sum;
	      n=n/10;
		}
		if(sum%2==0)
		{
		  return 1;
		}
		else
			return -1;
		
	}
	 
	

}
