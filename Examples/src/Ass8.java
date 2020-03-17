import java.util.ArrayList;
import java.util.*;

public class Ass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
	     ar.add("ghgh");
	     ar.add("fyfy");
	     ar.add("bgg");
	     ar.add("Ass");
	     System.out.println(ar);
	     //sort an array elements
	     ar.sort(null);
	     System.out.println(ar);
	     //extract portion in array
	    List<String> ar1=ar.subList(0,1);
	     System.out.println(ar1);
	     //join two array lis
	     ArrayList ar2=new ArrayList();
	     ar2.add("india");
	     ar2.add("china");
	     ar.addAll(ar2);
	     System.out.println(ar);
	     //replace 
	     ar2.set(1,"sgfdg");
	     System.out.println(ar2);
	     //elements using index
	     for(int i=0;i<ar.size();i++)
	    	 System.out.println(ar.get(i));
	     System.out.println(ar);
	}

}
