package org.tnsindia.userinput;

import java.util.Scanner;

public class DemoOnString {

	public static void main(String[] args) {
	
	//For user input value	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String x=s.nextLine();
		System.out.println("The result is : ");
		System.out.println(x);	
		s.close();
	}

}




/* --------------------------------------------------------
 //s.next just takes first word
 // s.nextLine takes all the compete sentence
------------------------------------------------------*/