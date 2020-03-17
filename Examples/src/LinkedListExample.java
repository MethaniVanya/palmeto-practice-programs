import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
               LinkedList ar=new LinkedList();
               int[] a={10,20,30,40};
               ar.add("java");
               ar.add("dotnet");
               ar.add("selenium");
               ar.add("oracle");
               for(int x:a)
               System.out.println(a);
               System.out.println(ar);
               LinkedList ar1=new LinkedList();
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
