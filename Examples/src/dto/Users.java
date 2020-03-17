package dto;

public class Users {

	String uname;
	String pass;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Users(String uname,String pass)
	{
		this.uname=uname;
		this.pass=pass;
	}
}