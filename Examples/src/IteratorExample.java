import java.util.ArrayList;
import java.util.Iterator;
public class IteratorExample {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add("java");
		ar.add("Dotnet");
		ar.add("selenium");
		System.out.println(ar);
		Iterator itr=ar.iterator();
		System.out.println(itr.next());
		System.out.println(itr.next());
		// TODO Auto-generated method stub

	}

}
