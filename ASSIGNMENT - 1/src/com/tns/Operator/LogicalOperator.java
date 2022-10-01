package com.tns.Operator;

public class LogicalOperator {
	
	  public static void main(String[] args) {

		    
		    System.out.println((5 > 3) && (8 > 5));       // && operator    
		    System.out.println((5 > 3) && (8 < 5));  

		   
		    System.out.println((5 < 3) || (8 > 5));      // || operator
		    System.out.println((5 > 3) || (8 < 5));  
		    System.out.println((5 < 3) || (8 < 5));  

		   
		    System.out.println(!(5 == 3));               // ! operator
		    System.out.println(!(5 > 3)); 
		}
}

