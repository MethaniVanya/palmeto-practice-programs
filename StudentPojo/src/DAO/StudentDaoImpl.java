package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import Data.Student;

public class StudentDaoImpl implements IStudentDAO {
     
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	public void create(Student student) {
		// TODO Auto-generated method stub
     String query="insert into student2 values('"+student.getId()+"','"+student.getName()+"','"+student.getAge()+"')";
     int result=jdbcTemplate.update(query);
     System.out.println(result+ "record inserted...");
	}

	@Override
	public Student getStudent(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from student2", new ResultSetExtractor<List<Student>>(){
			public List<Student>extractData(ResultSet rs) throws SQLException,DataAccessException{
				List<Student> list=new ArrayList<Student>();
				while(rs.next())
				{
					Student e=new Student();
					e.setId(rs.getInt(1));
					e.setName(rs.getString(2));
					e.setAge(rs.getInt(3));
					list.add(e);
				}
				return list;
			}
			});
	}
	

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub

	}

}
