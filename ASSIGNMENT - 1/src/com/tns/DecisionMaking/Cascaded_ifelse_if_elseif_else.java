package com.tns.DecisionMaking;

public class Cascaded_ifelse_if_elseif_else {

	public static void main(String[] args) {
		int a=11,b=7,c=23;
		if(a>b && a>c)
		{
			System.out.println(a);
		}
		else if(b>a && b>c)
		{
			System.out.println(b);

		}
		else
		{
			System.out.println(c);
		}
		

	}

}