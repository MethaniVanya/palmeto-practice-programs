import java.util.*;
import java.sql.*;

public class JDBCEmployee {

public static void main(String[] args) throws ClassNotFoundException,SQLException
{
// TODO Auto-generated method stub
DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
Connection connection=DriverManager.getConnection
("jdbc:mysql://localhost:3306/cts","root","root");
String query="insert into employees values(?,?,?,?,?,?)";
PreparedStatement ps=connection.prepareStatement(query);
Scanner sc=new Scanner(System.in);

System.out.println("Enter employee name");
String name=sc.next();
System.out.println("Enter employee id");
int id=sc.nextInt();
System.out.println("Enter  Department of employee");
String dept=sc.next();
System.out.println("Enter Designation");
String desg=sc.next();
System.out.println("Enter Company name");
String comp=sc.next();
System.out.println("Enter employee emailId");
String email=sc.next();

ps.setString(1,name);
ps.setInt(2,id);
ps.setString(3,dept);
ps.setString(4,desg);
ps.setString(5,comp);
ps.setString(6,email);

int a=ps.executeUpdate();
System.out.println((a+ "Records Inserted..."));
}

}


