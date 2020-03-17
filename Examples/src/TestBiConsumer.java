import java.util.ArrayList;
import java.util.function.*;
class TempEmp
{
	String name;
	double salary;
	TempEmp(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
}
public class TestBiConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<TempEmp> l= new ArrayList<TempEmp>();
    l.add(new TempEmp("moni",233));
    l.add(new TempEmp("sruthi",3444));
    l.add(new TempEmp("bunny",4444));
    BiConsumer<TempEmp,Double> c=(e,d)->e.salary=e.salary+d;
    for(TempEmp e:l)
    {
    	c.accept(e, 500.0);
    }
		
    for(TempEmp e:l)
    {
    	System.out.println("employee name"+e.name);
    System.out.println("employee salary" +e.salary);
    System.out.println();
	}
	
	}
}
