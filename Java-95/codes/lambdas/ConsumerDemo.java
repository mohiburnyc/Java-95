package co.edureka.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> obj = t ->	System.out.println("message = " + t.toUpperCase());		
		obj.accept("edureka");
		System.out.println();		
		
		List<String> names = Arrays.asList("Sanjay", "Arun", "Charles", "Bharath", "Pankaj", "Srinivas", "Chris", "Mark", "Sanjay");
		
		//using forEach(java.util.function.Cosnumer) method of java.lang.Iterable -- using Anonymous class concept
		names.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {				
				System.out.print(t + "     ");
			}			
		});
		
		System.out.println("\n");

		//using forEach(java.util.function.Consumer) method of java.lang.Iterable -- using lambda
		names.forEach(t -> System.out.print(t + "     "));
	}
}
