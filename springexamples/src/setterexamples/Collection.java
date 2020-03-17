package setterexamples;

import java.util.Iterator;
import java.util.List;

public class Collection {
	String id;
	String name;
	List<String> answers;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Collection(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void showAnswers()
	{
	System.out.println("QId: "+id+"Question :"+name);
	Iterator<String> itr=answers.iterator();
	while(itr.hasNext())
	{
	System.out.println(itr.next());
	}
	}
}
	
	
