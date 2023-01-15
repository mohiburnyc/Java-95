package co.edureka.util;

public class Test {

	public static void main(String[] args) {
		String s1 = "ABC";
		//String s2 = "ABC";
		String s2 = "ADA";
		
		int n = s1.compareTo(s2);
		System.out.println(n);
		
		System.out.println("Sanjay".compareTo("Sunil"));
		System.out.println("Sanjay".compareTo("Praveen"));
	}

}
