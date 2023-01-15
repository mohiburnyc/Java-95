package co.edureka.util;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>(); 
		
		System.out.println(names + " | size="+names.size());
		
		names.add("Sunil");
		names.add("Ahmadwalid");
		names.add("Bhanu Prakash");
		names.add("Sunil");
		names.add("Charulatha");
		names.add("Sunil");
		
		System.out.println(names + " | size="+names.size());
		System.out.println("is \"Sunil\" in list = " + names.contains("Sunil"));
		
		names.add(1, "Lakshmi");
		names.set(1, "LAKSHMI");
		System.out.println(names + " | size="+names.size());
		
		System.out.println("person @ index 0 = " + names.get(0));
		//System.out.println("person @ index 10 = " + names.get(10)); //java.lang.IndexOutOfBoundsException
		
		System.out.println("index of \"Sunil\" from start = " + names.indexOf("Sunil"));
		System.out.println("last index of \"Sunil\" = " + names.lastIndexOf("Sunil"));
		System.out.println("index of \"Joseph\" from start = " + names.indexOf("Joseph")); //-1
		
		System.out.println("remove(object) ---> " + names.remove("Sunil"));
		System.out.println("remove(index) ---> " + names.remove(0));
		
		System.out.println(names + " | size="+names.size());
	}

}
