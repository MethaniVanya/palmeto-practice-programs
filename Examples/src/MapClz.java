import java.util.*;
import java.util.Scanner;
class Cgroups
{
	String b1;
	String b2;
	String b3;
 public Cgroups(String b1,String b2,String b3)
 {
	 super();
	 this.b1=b1;
	 this.b2=b2;
	 this.b3=b3;
 }
}
public class MapClz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Map<String,Cgroups>map=new HashMap<String,Cgroups>();
    map.put("jntu", new Cgroups("cse","ece","civil"));
    map.put("svs", new Cgroups("cse","eee","civil"));
    map.put("nec", new Cgroups("cse","ece","civil"));
    Scanner s=new Scanner(System.in);
    System.out.println("enter department name");
    String s1=s.next();
    Set keys= map.entrySet();
    Iterator itr=keys.iterator();
    while(itr.hasNext())
    {
    	Map.Entry entry=(Map.Entry)itr.next();
      Cgroups depts=(Cgroups)entry.getValue();
      if((depts.b1.equals(s1))||(depts.b2.equals(s1))||(depts.b3.equals(s1)))
      {
    	  System.out.println(entry.getKey());
      }
    }
	}
}
