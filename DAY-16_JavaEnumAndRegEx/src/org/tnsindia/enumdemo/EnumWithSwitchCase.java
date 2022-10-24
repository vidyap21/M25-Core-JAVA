package org.tnsindia.enumdemo;

import java.util.Scanner;
//Example on enum with switch-Case
enum Movie
{
	//enums constants
	KGF2,BRAHMASHTRA,PUSHPA;
}
public class EnumWithSwitchCase
{
	//enum var
	Movie movie;
	//constructor for the "EnumWithSwitchCase"
	public EnumWithSwitchCase(Movie movie)
	{
		//as Enum var and constructor argument var is same -" use this keyword"
		this.movie=movie;
	}
	//using switch to display the actor name of the constants(movie)
	public  void display()
	{
		switch(movie)
		{
			case KGF2:
				System.out.println("Yash & Srinidhi Shetty");
				break;
			case BRAHMASHTRA:
				System.out.println("Ranbir Kapoor & Alia Bhatt Kapoor");
				break;
			case PUSHPA:
				System.out.println("Allu Arjun & Rashmika");
				break;
	
		}
	}
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Movie name that u want to display");
		String str=s.nextLine();
		//valueOf():-to get the constant whose value is passed as an argument while calling this method
		EnumWithSwitchCase obj=new EnumWithSwitchCase(Movie.valueOf(str));
		obj.display();
		
		

	}

}