package org.tnsindia.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.tnsindia.entities.Student;
import org.tnsindia.repository.StudentRepository;
import org.tnsindia.repository.StudentRepositoryImplementation;

public class StudentServiceImplementation implements StudentService {

	@Override
	public boolean AddStudent(Student student) {
		String query="INSERT INTO STUDENT VALUES(?,?)";
		StudentRepository repo=new StudentRepositoryImplementation();
		int count=repo.create(query, student);
		if(count==1)
			return true;
		return false;
	}

	
	
	@Override
	public boolean DeleteStudent(int rollno) {
		StudentRepository repo=new StudentRepositoryImplementation();
		String query="DELETE FROM STUDENT WHERE rollno= "+rollno;
		int count=repo.delete(query);
		if(count==1)
		{
			return true;
		}
		
		return false;
	}

	
	
	@Override
	public Student UpdateStudent(Student student) {
		String query="UPDATE STUDENT SET name=? WHERE(rollno=?)";
		StudentRepository repo=new StudentRepositoryImplementation();
		int count=repo.update(query, student);
		if(count==1)
		{
			Student s=GetStudent(student.getRollno());
		return s;
		}
		return null;
	}

	
	
	@Override
	public Student GetStudent(int rollno) {
		Student student=new Student();		
		StudentRepository repo=new StudentRepositoryImplementation();
		String query="SELECT * FROM STUDENT WHERE rollno="+rollno;
		ResultSet rs=repo.retrieve(query);
		
		try {
				rs.next();
				student.setRollno(rs.getInt(1));
				student.setName(rs.getString(2));
				//student.setPercentage(rs.getFloat(3));
			
			} catch (SQLException e) {
			System.out.println(e);			
		}
		return student;	
		
	}

	
	
	@Override
	public List<Student> GetStudents() {
		List<Student>students=new ArrayList<Student>();	
		StudentRepository repo=new StudentRepositoryImplementation();
		String query="SELECT * FROM STUDENT";
		ResultSet rs=repo.retrieve(query);
		
		try {
			while(rs.next())
			{
				Student student=new Student();
				student.setRollno(rs.getInt(1));
				student.setName(rs.getString(2));
				//student.setPercentage(rs.getFloat(3));
				students.add(student);
			}
			
		} catch (SQLException e) {
			System.out.println(e);			
		}
		return students;	
	}

}
