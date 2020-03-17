import java.util.*;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class FilterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<Integer> ar=new ArrayList<Integer>();
   Predicate<Integer> p =x->x%5==0;
   ar.add(0);
   ar.add(5);
   ar.add(10);
   ar.add(15);
   ar.add(20);
   ar.add(2);
   System.out.println(ar);
   Stream s=ar.stream();
   List<Integer> list=(List<Integer>) s.filter(p).collect(Collectors.toList());
   System.out.println(list);
	}

}
