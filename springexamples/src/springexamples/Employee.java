package springexamples;
public class Employee
{
String ename;
String empid;
String dept;
String desg;
String email;


public String getEname() {
	return ename;
}


public void setEname(String ename) {
	this.ename = ename;
}


public String getEmpid() {
	return empid;
}


public void setEmpid(String empid) {
	this.empid = empid;
}


public String getDept() {
	return dept;
}


public void setDept(String dept) {
	this.dept = dept;
}


public String getDesg() {
	return desg;
}


public void setDesg(String desg) {
	this.desg = desg;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public void displayemp()
{
System.out.println("Employee Name: "+ename);
System.out.println("Employee Id: "+empid);
System.out.println("Employee Department: "+dept);
System.out.println("Employee Designation: "+desg);
System.out.println("Employee Email: "+email);

}
}

