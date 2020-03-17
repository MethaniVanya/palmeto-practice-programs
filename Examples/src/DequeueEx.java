import java.util.*;
public class DequeueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       PriorityQueue d=new PriorityQueue();
       d.add(10);
       d.add(20);
       System.out.println(d);
       d.remove();
       System.out.println("after removal");
       System.out.println(d);
       d.add(9);
       System.out.println(d);
       d.add(8);
       System.out.println(d);
       d.remove();
       System.out.println(d);
	}

}
