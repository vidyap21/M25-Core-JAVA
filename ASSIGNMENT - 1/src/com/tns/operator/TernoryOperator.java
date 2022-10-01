package com.tns.operator;

public class TernoryOperator {
	
		  public static void main(String[] args) {

		    int februaryDays = 29;
		    String result1,result2;
		    result1 = (februaryDays == 28) ? "Not a leap year" : "Leap year";
		    result2 = (februaryDays == 29) ? "Not a leap year" : "Leap year";
		    System.out.println(result1);
		    System.out.println(result2);
		  }
		}

