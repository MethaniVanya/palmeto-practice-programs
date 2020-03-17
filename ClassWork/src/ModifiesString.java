import java.util.Scanner;

public class ModifiesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter a string");
String st=s.next();
char[] c=new char[1];
c=st.toCharArray();
int i=st.length();
String m="";
if(c[0]=='j')

	m=m+c[0];
	if(c[1]=='b')
		m=m+c[1];
for(int j=2;j<i;j++)
	m=m+c[j];
System.out.println(m);
	}

}
