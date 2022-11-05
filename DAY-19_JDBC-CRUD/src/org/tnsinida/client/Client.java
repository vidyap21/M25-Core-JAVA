package org.tnsinida.client;

import java.util.List;
import java.util.Scanner;

import org.tnsindia.entities.Student;
import org.tnsindia.service.StudentService;
import org.tnsindia.service.StudentServiceImplementation;

public class Client {

	public static void main(String[] args) {
		int choice;
		StudentService service=new StudentServiceImplementation();
		Scanner sc=new Scanner(System.in);
		do 
		{
			System.out.println("ENTER THE CHOICE : "
					+"\n 1.INSERT A STUDENT"
					+"\n 2.RETREIVE A PARTICULAR STUDENT"
					+"\n 3.RETREIVE ALL THE STUDENTS"
					+"\n 4.UPDATE A STUDENT"
					+"\n 5.DELETE A STUDENT"
					+"\n-1.EXIT");
			choice=sc.nextInt();
			switch(choice)
			{
			
			
			case 1:
			{
				System.out.println("ENTER THE DETAILS OF THE STUDENT");
				Student student=new Student(sc.nextInt(),sc.next());
				if(service.AddStudent(student))
					System.out.println("STUDENT ADDED SUCCESSFULLY!!");
				else
					System.out.println("DETAILS NOT FOUND!!");
			}
			break;
			
			
			
			case 2:
			{
				System.out.println("ENTER THE ROLLNO OF STUDENT WHOSE DETAILS ARE REQUIRED");
			    Student student;
			    try {
			    student=service.GetStudent(sc.nextInt());
			    }
			    catch(Exception e)
			    {
			    	student=null;
			    }
			    if(student!=null)
			    {
			    	System.out.println(student);
			    }
			    else
			    	System.out.println("ROLLNO NOT FOUND");
			}
			break;
			
			
			
			case 3:
			{
				List<Student>students=service.GetStudents();
				for(Student s: students)
					System.out.println(s);
			}
			break;
			
			
			
			case 4:
			{
				System.out.println("ENTER THE ROLLNO OF THE STUDENT TO UPDATE A DATA");
				Student student=new Student();
				student.setRollno(sc.nextInt());
				System.out.println("ENTER THE UPDATED DETAILS");
				sc.nextLine();
				student.setName(sc.nextLine());
				sc.nextFloat();
				//student.setPercentage(sc.nextFloat());
				
				Student s=service.UpdateStudent(student);
				if(s!=null)
					System.out.println(s);
				else
					System.out.println("STUDENT NOT FOUND");
			}
			break;
			
			
			
			case 5:
			{
				System.out.println("ENTER THE ROLLNO THAT YOU WANT TO DELETE");
				boolean success=service.DeleteStudent(sc.nextInt());
				if(success)
					System.out.println("DELETED SUCCESSFULLY");
				else
					System.out.println("DATA NOT FOUND");
			}
			break;
			
			
			
			case -1:
			{
				System.out.println("THANK YOU!!!");
			}
			break;
			
			
			
			default:
				System.out.println("ENTER THE VALID CHOICE!");
				break;
			}
			
			
			
			}while(choice>0);
		}
		    
}	
	
		
	
