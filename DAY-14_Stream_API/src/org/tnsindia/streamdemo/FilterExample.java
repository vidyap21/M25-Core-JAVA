package org.tnsindia.streamdemo;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		List<String>obj=Arrays.asList(new String[]{"PIYUSH","AB","MANASI","RAM"});
		obj.stream().filter((i->i.length()>4)).forEach((i)->System.out.print(i+" "));
	}

}