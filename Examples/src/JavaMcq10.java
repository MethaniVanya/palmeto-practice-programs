import java.util.Scanner;
public class JavaMcq10 {
 
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a color");
String str=s.nextLine();
if(str.matches("(#)[A-F0-9]{6}"))
System.out.println("valid color");
else
System.out.println("invalid color");
}
}

	
	
