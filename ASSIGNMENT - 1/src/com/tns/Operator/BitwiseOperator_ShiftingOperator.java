package com.tns.Operator;

public class BitwiseOperator_ShiftingOperator {
	public static void main(String[] args) {

	    int number1 = 12, number2 = 25, result;

	   
	    result = number1 & number2;                   // bitwise AND 
	    System.out.println(result);   
	    
	
	    result = number1 | number2;                 // bitwise OR
	    System.out.println(result);    
	    
	 
	    result = number1 ^ number2;               // bitwise XOR
	    System.out.println(result);   
	    
	    
	    int X = 8;
	    int Y = -8;
	    System.out.println(X >> 2);      // >> shift operator
	    System.out.println(Y >> 2);     
	    
	   
	    int Z = 2;
	    int Output = Z << 2;            // >> shift operator
	    System.out.println(Output);    
	  }
 }
	

