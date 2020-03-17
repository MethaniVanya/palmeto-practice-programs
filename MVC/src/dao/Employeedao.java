package dao;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import data.Employee;
import java.sql.Statement;
import java.sql.Connection;
public class Employeedao {
 public static Connection getConnection()throws ClassNotFoundException,ServletException,IOException,SQLException
 {
		Connection con=null;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
  }
 public int insertEmployee(Employee emp)
 {
 int result=0;
 try 
 {
	 Connection con =getConnection();
	 String sql="insert into emp values(?,?,?,?,?)";
	 PreparedStatement pst=con.prepareStatement(sql);
	
	 pst.setString(1, emp.getEmpid());
	 pst.setString(2, emp.getEname());
	 pst.setString(3, emp.getDept());
	 pst.setString(4, emp.getDesg());
	 pst.setString(5, emp.getEmail());
	 result=pst.executeUpdate();  
	 }
 catch(Exception e)
 {
	 System.out.println(e);
 
 }
 return result;
 }
 public List<Employee> showEmployee()
 {

 List<Employee> list =new ArrayList<Employee>();
 try
 {
	 Connection con=getConnection();
	Statement ps=con.createStatement();
	ResultSet rs=ps.executeQuery("select * from emp");
	while(rs.next())
	{
		Employee u=new Employee();
		
		u.setEmpid(rs.getString(1));
		u.setEname(rs.getString(2));
		u.setDept(rs.getString(3));
		u.setDesg(rs.getString(4));
		u.setEmail(rs.getString(5));
		list.add(u);
	}
  }
 catch(Exception e)
 {
	 	System.out.println(e);
 }
 return list;
 }
 }
  
