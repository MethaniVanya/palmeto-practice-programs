
public class UserMainCode2 {
	 public static String findRoots(int a,int b, int c)
	 {
	
          int n=(b*b)-(4*a*c);
		 if(n>=0)
			 return "roots are real and un equal";
		 else if(n==0) 
		    return "roots are real and equal";
		 else
			 
		 return "roots are imaginary";
	 }

}
