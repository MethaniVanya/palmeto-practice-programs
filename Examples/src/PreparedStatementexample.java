import java.sql.*;
import java.util.Scanner;

public class PreparedStatementexample 
{

	public static void main(String[] args) throws ClassNotFoundException,SQLException 
	{
		// TODO Auto-generated method stub
		try
		{
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection connection=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/cts","root","root");
			String query="insert into staff values  (?,?,?)";
			PreparedStatement pst=connection.prepareStatement(query);
			Scanner sc=new Scanner(System.in);
			System.out.println("enter staff name");
			String name=sc.next();
			System.out.println("enter staff id");
			int id=sc.nextInt();
			
			System.out.println("enter staff dept");
			String ctype=sc.next();
			
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3, ctype);
			int x=pst.executeUpdate();
			System.out.println(x+"record inserted....");
			     
		}
		catch(SQLException e)
		{
		System.out.println(e);
		}

	}

}
