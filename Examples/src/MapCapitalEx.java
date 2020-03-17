import java.util.*;
import java.util.ArrayList;

public class MapCapitalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Map<Integer,String> m=new HashMap<Integer,String>();
    ArrayList<String> ar= new ArrayList<String>();
    m.put(1001, "Abcs");
    m.put(1002, "sdsA");
    m.put(1003, "asdfA");
    m.put(1004, "Mooni");
    m.put(1005, "monIZ");
    Set keys=m.entrySet();
    Iterator itr=keys.iterator();
    while(itr.hasNext())
    {
      	Map.Entry entry=(Map.Entry)itr.next();
      	String str=(String) entry.getValue();
     if(str.charAt(0)>=97&&str.charAt(0)<=123 &&str.charAt(str.length()-1)>=65 && str.charAt(str.length()-1)<=90)
     {
    	 ar.add(str);
     }
    }
    System.out.println("the names satisfying conditon are :");
    for(String c:ar)
    {
    	System.out.println(c);
    }
}

}
