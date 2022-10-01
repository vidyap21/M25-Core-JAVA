package com.tns.Operator;

public class Increment_DecrementOperator {
	
		  public static void main(String[] args) {
		    
		    int a = 12 ;
		    int result1, result2, result3, result4 ;

		   
		    System.out.println("Value of a: " + a);

		    
		    result1 = ++a;                             // increment operator ++a
		    System.out.println("After increment: " + result1);
		    result2 = --a;                            // decrement operator --a
		    System.out.println("After decrement: " + result2);
		    
		    
		    result3 = a++;                           // increment operator a++
		    System.out.println("After increment: " + result1);
		    result4 = a--;                           // decrement operator a--
		    System.out.println("After decrement: " + result2);
		    
		}
}

