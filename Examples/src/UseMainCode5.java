
public class UseMainCode5 {
	 public static int findElement(int[] a,int n)
	 { 
		 boolean found=false;
		 int mid,low=0,high=a.length-1;
		 mid=(low+high)/2;
		 while(low<=high)
		 {
			 if(a[mid]==n)
			 {
				 found=true;
				 break;
			 }
			 else if(a[mid]<n)
			 {
				 low=mid+1;
			 }
				 else if(a[mid]>n)
				 {
					 high=mid-1;
				 }
			 mid=(low+high)/2;
		   }
		if(found)
		{
			return 1;
		}		
		else return 0;
	 }

}
