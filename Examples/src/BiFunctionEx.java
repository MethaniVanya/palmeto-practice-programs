import java.util.function.*;
public class BiFunctionEx {

	public static void main(String[] args) {
		 BiFunction<Integer,Integer,Integer> add =(a,b)->(a+b);
		  BiFunction<Integer,Integer,Integer> sub =(a,b)->(a-b);
		  System.out.println("the sum is:" +add.apply(10,7));
		  System.out.println("the diff is"+sub.apply(6,8));
		  
		// TODO Auto-generated method stub

	}

}
