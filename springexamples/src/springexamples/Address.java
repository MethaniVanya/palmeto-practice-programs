package springexamples;

public class Address {

	String no;
	String street;
	String city;
	public Address(String no, String street, String city) {
		super();
		this.no = no;
		this.street = street;
		this.city = city;
	}
	public String toString()
	{
		return "Address[no="+no+",street="+street+",city="+city+"]";
	}
}
