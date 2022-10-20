package org.tnsindia.generics;

public class GenericMethod {

	public static void main(String[] args) {
		Integer arr[] = {11,22,33};
		Character ch[]  = {'p','s','z'};
		
		System.out.println(" Integer array: ");
		print(arr);
		
		System.out.println(" Character array: ");
		print(ch);
		

	}
	//Generic Method: We can pass any type of Arguments E is a Element
	public static <E>void print(E[] elements) 
	{
		for(E ele:elements )
		{
			System.out.println(ele);
		}
	}

}