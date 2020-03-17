import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
public class Student {

	public static void main(String[] args) {
		ArrayList<Students>ar=new ArrayList<Students>();
		Students s1=new Students("siri",40);
		Students s2=new Students("raju",78);
		Students s3=new Students("ravi",90);
		Students s4=new Students("krishna",20);
		Students s5=new Students("seetha",18);
		Students s6=new Students("latha",75);
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		ar.add(s4);
		ar.add(s5);
		ar.add(s6);
	System.out.println("Passed Students--------:");
	Predicate<Students>p=s->s.marks>=40;
	Function<Students,String>f=stud->{
		int m=stud.marks;
		if(m>=80)
			return "Distinction";
		else if(m>=60 && m<=79)
			return "First Class";
		else if(m>=40 && m<=50)
			return "Second class";
		else
			return "Fail";
	};
	Consumer<Students>c=s->{
		
		System.out.print(s.name+"  ");
		System.out.println(f.apply(s));
	};
	for(Students s:ar) 
	 {
		if(p.test(s))
		{
			c.accept(s);
		}
			
	 }
	}

}

