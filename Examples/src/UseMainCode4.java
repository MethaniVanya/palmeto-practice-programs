
public class UseMainCode4 {
	
	public static int findElement(int[] a,int n)
	{
		boolean flag=false;
		for(int i=0;i<a.length;i++)
			if(a[i]==n)
			{
				flag=true;
				break;
			}
		if(flag)
			return 1;
		else
		return 0;
		
	}

}
