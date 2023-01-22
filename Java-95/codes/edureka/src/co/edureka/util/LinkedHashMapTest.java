package co.edureka.util;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		Map<String, Float> bank = new LinkedHashMap<String, Float>();
		
		System.out.println(bank.put("Sunil", 15000f)); //null
		System.out.println(bank.put("Sunil", 11500.5f)); //15000.0	
		System.out.println(bank.put("Sanjay", 12500.5f)); //null	
		bank.put("Praveen", 25750f);
		bank.put("Charles",24000.25f);
		bank.put("Rahul", 12750.50f);
		bank.put("Shankar", 45000f);
		
		System.out.println(bank);
		
		bank.put(null, null);
		System.out.println(bank);		
	}

}
