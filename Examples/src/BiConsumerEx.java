import java.util.function.*;
public class BiConsumerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   BiConsumer<String,String> bc=(a,b)->System.out.println(a+b);
   bc.accept("hello","hi");
	}

}
