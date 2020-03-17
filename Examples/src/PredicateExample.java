import java.util.function.Predicate;
public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //Predicate<integer> p=I -> (I >0);
     //Predicate<integer>p1=i->(i%2==0);
		String[] names= {"abc","dfd","fdf","fdfsd"};
		Predicate<String> Ktest=s->s.charAt(0)=='K';
		for(String n:names)
		{
			if(Ktest.test(n))
			{
				System.out.println(n);
			}
		}
		/*Predicate<String>p5 =str1->(str1.charAt(0)==('A'));
     Predicate<String>p2=str->(str.length()<=3);
     Predicate<Integer>p4=i->{
    	 boolean flag=true;
    	 for(int x=2;x<i;x++)
    	 {
    		 if(i%x==0)
    		 {
    			 flag=false;
    			 break;
    		 }
    	 }
    	 return flag;
     };
     System.out.println(p4.test(2));
     System.out.println(p2.test("sdf"));
     System.out.println(p2.test("sdfsf"));
     System.out.println(p5.test("Adf"));*/
	}

}
