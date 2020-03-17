import java.util.*;
import java.util.ArrayList;

public class Program4 
{
	public static ArrayList<Integer> performSetOperations(ArrayList<Integer> a1,ArrayList<Integer> a2, char c)
	{
	ArrayList<Integer> ar = new ArrayList<Integer>();
    int n = 0;
    switch (c) 
    {
    	case '+':
    		a1.removeAll(a2);
    		a1.addAll(a2);
    		ar = a1;
    		break;
    	case '*':
    		a1.retainAll(a2);
    		ar = a1;
    		break;
    	case '-':
      for (int i = 0; i < a1.size(); i++) 
      {
        n = 0;
        for (int j = 0; j < a2.size(); j++) 
        {
          if (a1.get(i) == a2.get(j))
            n = 1;
        }
        if (n == 0)
          ar.add(a1.get(i));
      }
      break;
    }
    return ar;
	}
}


