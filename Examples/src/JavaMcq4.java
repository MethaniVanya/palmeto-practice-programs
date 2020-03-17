import java.util.Scanner;
public class JavaMcq4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner s=new Scanner(System.in);
  System.out.println("enter a string");
  String s1=s.nextLine();
  System.out.println("enter a input");
  int i=s.nextInt();
  StringBuffer s2= new StringBuffer();
  s2.append(s1.substring(0,i));
  s2.append(s1.substring(s1.length()-i));
  System.out.println(s2.toString());
	}

}
