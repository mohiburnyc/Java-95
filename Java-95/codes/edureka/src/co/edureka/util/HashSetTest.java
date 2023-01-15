package co.edureka.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();

		System.out.println(names.add("Sunil")); //true
		System.out.println(names.add("Sunil")); //false
		System.out.println(names.add("Praveen")); //true
		names.add("Sanjay");
		names.add("Pankaj");
		names.add("Deepak");
		names.add("Srinivas");
		
		System.out.println(names + " size="+names.size());
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println("-------> " + name);
		}
		
		names.add(null);
		System.out.println(names);
	}

}
