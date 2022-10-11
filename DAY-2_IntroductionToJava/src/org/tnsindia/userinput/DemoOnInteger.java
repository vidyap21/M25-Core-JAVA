package org.tnsindia.userinput;

import java.util.Scanner;

public class DemoOnInteger {

	public static void main(String[] args) {
	
	//For user input value	
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter The Value Of X:  ");
		 int x=s.nextInt();
		 System.out.println("The Result Is:  ");
		 System.out.println(x);
		 s.close();
	}
	
}