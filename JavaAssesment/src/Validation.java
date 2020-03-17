import java.util.Scanner;
import java.util.*;

class Pan
{
	public static int testPan(String s)
	{
		if(s.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}"))
		{
        
			return 1;
		}
		else
			return -1;
		//System.out.println("Invalid");
		}
}
public class Validation {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Pan Number");
		String s=sc.next();
		int p=Pan.testPan(s);
		if(p==1)
		{
			System.out.println("valid");
		}
		else
		{
	         System.out.println("invalid");
		}
	}

}

/*import java.util.Scanner;
class PAN
{
public static int testPan(String str)
{
if(str.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}"))
{
return 1;
}
else
{
return -1;
}
}

}
public class Validation {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter PAN Number");
String str=s.next();
int b=PAN.testPan(str);
if(b==1)
{
System.out.println("Valid Pan Number");
}
else
{
System.out.println("Invalid Pan Number");
}

}

}
*/