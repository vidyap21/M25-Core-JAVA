package org.tnsindia.setdemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		SortedSet<String> s=new TreeSet<>();
		s.add("VIDYA");
		s.add("VEENA");
		s.add("KAILAS");
		s.add("PRABHA");
		System.out.println("The elements in the TreeSet are: "+s);

	}

}