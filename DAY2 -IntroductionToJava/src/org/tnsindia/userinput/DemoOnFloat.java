package org.tnsindia.userinput;
import java.util.Scanner;
public class DemoOnFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
	//Code for float data type
		System.out.println("Enter any decimal value: ");
		float x=s.nextFloat();
		System.out.println("The result for float is : "+x);
		
	//Code for double data type
		System.out.println("\n\nEnter any bigger value in decimal: ");
		double y=s.nextDouble();
		System.out.println("The result for double data type is: "+y);
		s.close();
	}

}