package co.edureka.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Float> bank = new HashMap<String, Float>();
		
		System.out.println(bank.put("Sunil", 15000f)); //null
		System.out.println(bank.put("Sunil", 11500.5f)); //15000.0	
		System.out.println(bank.put("Sanjay", 12500.5f)); //null	
		bank.put("Praveen", 25750f);
		bank.put("Charles",24000.25f);
		bank.put("Rahul", 12750.50f);
		bank.put("Shankar", 45000f);
		
		System.out.println(bank);
		System.out.println();
		
		float bal = bank.get("Sunil");
		System.out.println("A/C Balance of \"Sunil\" = " + bal);
		bal += 1250.5f;
		bank.put("Sunil", bal);
		System.out.println(bank);
		System.out.println();
		
		System.out.print("A/C Holders ----> ");
		Set<String> names = bank.keySet();
		for(String name : names) {
			System.out.print(name + " | ");
		}
		System.out.println("\n");
		
		Set<Map.Entry<String, Float>> entries = bank.entrySet();
		Iterator<Map.Entry<String, Float>> it = entries.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Float> entry = it.next();
			
			String key = entry.getKey();
			float value = entry.getValue();
			
			System.out.printf("%-10s -----> %.2f \n", key, value);
		}
		
		System.out.println();
		
		bank.put(null, null);
		System.out.println(bank);
	}
}