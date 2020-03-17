import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Consumer;
class Stud
{
	String name;
	int marks;
	Stud(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
}
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<Stud> list=new ArrayList<Stud>();
   Stud s1=new Stud("xyz",80);
   Stud s2=new Stud("abc",50);
   Stud s3=new Stud("hgh",70);
   	Stud s4=new Stud("cdc",37);
   	list.add(s1);
   	list.add(s2);
   	list.add(s3);
   	list.add(s4);
   	Predicate<Stud> p=s->s.marks>=60;
   	System.out.println(p.test(s1));
   
   	Function<Stud,String>f=s->{
   		int marks=s.marks;
   		if(marks>=80)
   			return "distinction";
   		else if(marks>=60)
   			return "firstclass";
   		else if(marks>=50)
   			return "second class";
   			else
   				return "fail";
   	};
   	
	Consumer<Stud>c=s->{
		System.out.println("student name:+"+s.name);
		System.out.println("studnet marks"+s.marks);
		System.out.println("student grade"+f.apply(s));
	};
	if(p.test(s2))
		c.accept(s2);
	else
		System.out.println("student fails");
	/*for(Stud s:list)
	{
		if(p.test(s0)) {
			c.accept(s)
			else
				System.out.println("fail");
		}
	}*/
	}

}
