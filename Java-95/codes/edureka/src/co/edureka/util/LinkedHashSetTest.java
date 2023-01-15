package co.edureka.util;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		Set<String> names = new LinkedHashSet<String>();

		System.out.println(names.add("Sunil")); //true
		System.out.println(names.add("Sunil")); //false
		System.out.println(names.add("Praveen")); //true
		names.add("Sanjay");
		names.add("Pankaj");
		names.add("Deepak");
		names.add("Srinivas");
		
		System.out.println(names + " size="+names.size());
		
		names.add(null);
		System.out.println(names);		
	}

}
