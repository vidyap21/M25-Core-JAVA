package org.tnsindia.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.tnsindia.entities.Student;

public interface StudentRepository {

	//abstract methods
	public abstract int create(String query, Student student);  //Creation
	public abstract int update(String query, Student student);  //Updation
	public abstract int delete(String query);  //Deletion
	public abstract ResultSet retrieve (String query);  //Retrieve
	Statement createstatement();
	PreparedStatement createPreparedStatement(String query);
	
}
