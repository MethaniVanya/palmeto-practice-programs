import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               ArrayList ar=new ArrayList();
               int[] a={10,20,30,40};
               ar.add("java");
               ar.add("dotnet");
               ar.add("selenium");
               ar.add("oracle");
               for(int x:a)
               System.out.println(a);
               System.out.println(ar);
               ArrayList ar1=new ArrayList();
               ar1.add("db");
               ar1.add("python");
               ar.add(ar1);
             System.out.println(ar);

             ar1.add("ruby");
             if(ar.containsAll(ar1))
            	 System.out.println("element found");
             else
            	 System.out.println("not found");
	}

	

}
