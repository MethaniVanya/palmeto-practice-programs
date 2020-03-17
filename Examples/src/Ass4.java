import java.util.ArrayList;

public class Ass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
	     ar.add("ghgh");
	     ar.add("fyfy");
	     ar.add("bjkvbjks");
	     System.out.println(ar);
	    System.out.println(ar.get(2));
	    ar.set(2, "hapy");
	    System.out.println(ar);
	    System.out.println(ar.remove(1));
	 
	   ar.contains("ghgh");
	   if(ar.contains("ghgh"))
		   System.out.println("true");
	   else
		   System.out.println("false");
	}

}
