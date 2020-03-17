import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringSentence {

public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter your String:");
String a = s.nextLine();
StringTokenizer st = new StringTokenizer(a, " ");
StringBuffer sb = new StringBuffer();

while (st.hasMoreTokens())
{
String s1 = st.nextToken();
String s2 = s1.substring(s1.length() - 1);
String s3 = s2.toUpperCase();
sb.append(s3).append("$");
}
System.out.println(sb);
}

}