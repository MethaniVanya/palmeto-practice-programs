package Four;

public class Person {
	String name;
	int age;
	Address address;
	public Person(String name,int age,Address address){
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public void show() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(address.name);
		System.out.println(address.city);
		System.out.println(address.area);
		
	}

}
