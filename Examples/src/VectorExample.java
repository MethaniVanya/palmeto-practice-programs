import java.util.Stack;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Vector v=new Vector();
       v.addElement("fdf");
       v.add("china");
       v.addElement("india");
       System.out.println(v);
       v.insertElementAt("america",2);
       System.out.println(v);
		v.removeElement("fdf");
		System.out.println(v);
		System.out.println(v.firstElement());
		Stack s=new Stack();
		s.push("java");
		s.push("oracle");
		s.push("html");
		System.out.println(s);
		String temp=(String)s.pop();
		System.out.println(temp);
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		int k= search();
		if(k>=0)
			System.out.println("element found");
		else
			System.out.println("not found");
		
	}

}
