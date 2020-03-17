import java.util.function.Predicate;
public class Predicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x= {0,5,10,15,20,25,30};
           Predicate<Integer>p1=i->(i>=10);
        Predicate<Integer>p2=i->(i%2)==0;
       // System.out.println(p1.test(1));
        //System.out.println(p2.test(3));
      //  System.out.println(p1.or(p2).test(50));
	  System.out.println("the number greater than 10");
	  m1(p1,x);
	  System.out.println("the number not greater than 10:");
	  m1(p1.negate(),x);
	  System.out.println("the number greater than 10 and even");
	  m1(p1.and(p2),x);
	  System.out.println("even");
	  m1(p2,x);
	  System.out.println("greater than 10 or odd");
      m1(p1.or(p2),x);
	}
	public static void m1(Predicate<Integer> p,int[] x)
	{
		for(int x1:x)
		{
			if(p.test(x1))
				System.out.println(x1);
		}
	}
}
