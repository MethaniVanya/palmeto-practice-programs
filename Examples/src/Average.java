import java.util.Scanner;
import java.util.TreeMap;

public class Average {
	enum test{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of students");
		int n=sc.nextInt();
		TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
			
			int id=sc.nextInt();
			int marks=sc.nextInt();
			tm.put(id, marks);
			 	
		}
		System.out.println(tm);
				for (Entry<String, String> entry : tm.entrySet()) {
				    String key = entry.getKey();
				    String value = entry.getValue();

				    System.out.printf("%s : %s\n", key, value);
				}		
	}

}








/*import java.util.*;


class Average {
  //Method for sorting the TreeMap based on values
  public static <K, V extends Comparable<V>> Map<K, V> 
    sortByValues(final Map<K, V> map) {
    Comparator<K> valueComparator = 
             new Comparator<K>() {
      public int compare(K k1, K k2) {
        int compare = 
              map.get(k1).compareTo(map.get(k2));
        if (compare == 0) 
          return 1;
        else 
          return compare;
      }
    };
 
    Map<K, V> sortedByValues = 
      new TreeMap<K, V>(valueComparator);
    sortedByValues.putAll(map);
    return sortedByValues;
  }
  public static void main(String args[]) {
 
    TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();

    // Put elements to the map
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number of students");
	int n=sc.nextInt();
    for(int i=0;i<n;i++)
	{
		
		int id=sc.nextInt();
		int marks=sc.nextInt();
		tm.put(id, marks);
		 	
	}
    // Calling the method sortByvalues
    Map sortedMap = sortByValues(tm);
 
    // Get a set of the entries on the sorted map
    Set set = sortedMap.entrySet();
 
    // Get an iterator
    Iterator i = set.iterator();
 
    // Display elements
    while(i.hasNext()) {
      Map.Entry me = (Map.Entry)i.next();
      System.out.print(me.getKey() + ": ");
      System.out.println(me.getValue());
    }
  }
}
*/

