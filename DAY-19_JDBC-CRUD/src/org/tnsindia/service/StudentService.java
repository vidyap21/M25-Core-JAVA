package org.tnsindia.service;

import java.util.List;

import org.tnsindia.entities.Student;

public interface StudentService {
	
	public boolean AddStudent(Student student);
	public boolean DeleteStudent(int nextInt);
	public Student UpdateStudent(Student student);
	public Student GetStudent(int rollno);
	public List<Student>GetStudents();



}
