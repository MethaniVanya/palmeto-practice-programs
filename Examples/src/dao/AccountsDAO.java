package dao;

import java.sql.Connection;
0
public class AccountsDAO {
	private static String jdbcURL;
    private static String jdbcUsername;
    private static String jdbcPassword;
    private static Connection jdbcConnection;
    public AccountsDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
        this.jdbcURL = jdbcURL;
        this.jdbcUsername = jdbcUsername;
        this.jdbcPassword = jdbcPassword;
    }
     
	public void withdraw(float amount)
	{
		
	}
  public void deposit(float amount)
  {
	  
  }
  
}
