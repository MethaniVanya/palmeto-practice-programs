package dto;

public class Accounts {
	  String actnum;
	  String acttype;
      String  customername;
float balance;
      
public Accounts(String actnum, String acttype, String customername, float balance) {
	super();
	this.actnum = actnum;
	this.acttype = acttype;
	this.customername = customername;
	this.balance = balance;
}
@Override
public String toString() {
	return "Accounts [accountNumber=" + actnum + ", accountType=" + acttype + ", customername="
			+ customername + ", balance=" + balance + "]";
}
      public String getactnum() {
		return actnum;
	}

	public void setactnum(String actnum) {
		this.actnum = actnum;
	}

	public String getActtype() {
		return acttype;
	}

	public void setActtype(String acttype) {
		this.acttype = acttype;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	
}
