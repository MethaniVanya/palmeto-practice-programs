package DAO;

import java.util.List;

import Data.Student;

public interface IStudentDAO 
{
	//this method is used to insert a record in table
	public void create(Student student);
	
	//to retrive student records with id
	public Student getStudent(Integer id);
	
	public List<Student> getStudents();
	
	public void delete(Integer id);
	
	public void update(Student student);
}
