package com.tns.operator;

public class AssignmentOperator {
	
		  public static void main(String[] args) {
		    
		    
		    int a = 4;
		    int var;

		   
		    var = a;                                              // assign value using =
		    System.out.println("var using =: " + var);

		   
		    var += a;                                             // assign value using +=
		    System.out.println("var using +=: " + var);

		    var -= a;                                             // assign value using -=
		    System.out.println("var using -=: " + var);

		    
		    var *= a;                                             // assign value using =*
		    System.out.println("var using *=: " + var);
		    
		    var /= a;                                             // assign value using =*
		    System.out.println("var using /=: " + var);
		    
		    var %= a;                                             // assign value using =*
		    System.out.println("var using %=: " + var);
		    
		  }
}

