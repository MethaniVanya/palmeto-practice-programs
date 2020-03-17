/*import java.util.Collections;
import java.util.LinkedList;

class Students implements Comparable<Students>
{
	String htno;
	String name;
	Students(String htno,String name)
	{
		this.name=name;
		this.htno=htno;
	}

public String toString() {
	return "htno=" +htno+ ",name="+name;
  }
  public int compareTo(Students student)
  {
	  if(name.compareTo(student.name)<0)
		  return -1;
	  else if(name.compareTo(student.name)>0)
		  return -1;
		  else
			  return 0;
  }
}
public class Comparable{
	  public static void main(String[] args)
	  {
		  Students s1=new Students("123","abc");
		  Students s2=new Students("344","xyc");
		  Students s3=new Students("543","gff");
		  LinkedList r=new LinkedList();
		  r.add(s1);
		  r.add(s2);
		  r.add(s3);
		  System.out.println(r);
		  Collections.reverse(r);
		  System.out.println("after reverse");
		  r.forEach(System.out::println);
		  
	  }
}*/
