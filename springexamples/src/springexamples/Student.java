package springexamples;

public class Student {
	String name;
	String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void showStudent()
	{
		System.out.println("student Name: "+name);
		System.out.println("student age: "+age);
	}
	

}
