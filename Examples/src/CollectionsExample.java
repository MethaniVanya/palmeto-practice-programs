import java.util.ArrayList;
import java.util.Collections;
public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList ar= new ArrayList(3);
 ar.add("jhgu");
 ar.add("fdf");
 ar.add("dfsds");
 System.out.println(ar);
 Collections.sort(ar);
 System.out.println(ar);
 Collections.reverse(ar);
 System.out.println(ar);
 ArrayList ar1=new ArrayList(3);
 Collections.copy(ar1, ar);
 System.out.println("elements in a new list");
 System.out.println(ar1);
 //ar1.add("jhgu");
 //ar1.add("fdf");
 //ar1.add("dfsds");
 Collections.fill(ar, "Languages");
 System.out.println("after filling");
 System.out.println(ar);
 //boolean flag =Collections.disjoint(ar, ar1);
		 //System.out.println(flag);
	}

}
