import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.math.*;

/*interface Mathematics
{
	public int add(int a,int b);
}*/
public class ThreadL{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Runnable r=()->{
			for(int i=0;i<=10;i++)
				System.out.println(i);
		};
 Thread t =new Thread(r);
   t.start();
   Mathematics run=(a,b)->a+b;
   System.out.println(run.add(10, 2));
   System.out.println(run.add(10, 20));
   System.out.println(run.add(10, 7));   
 */   
   Predicate<Integer> p1=a->(a%2==0);
   System.out.println(p1.test(6));
   System.out.println(p1.test(5));
   
   Function<Integer,Double>area=b->(3.14*b*b);
   System.out.println("Area of circle :" +area.apply(2));
   
   BiFunction<Integer,Integer,Integer>areas=(a,b)->(a*b);
   System.out.println("Area of circle :" +areas.apply(2,3));
   
   
   }
	   
}


