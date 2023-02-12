package co.edureka.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sanjay", "Arun", "Charles", "Bharath", "Pankaj", "Srinivas", "Chris", "Mark", "Sanjay");
		System.out.println(names);
		System.out.println();
		
		/*
		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int n = o1.compareTo(o2);
				if(n>0)
					return -1;
				else
					return 1;
			}			
		};
		*/
		
		/*
		Comparator<String> comp = (String o1, String o2) -> {
				int n = o1.compareTo(o2);
				if(n>0)
					return -1;
				else
					return 1;
		};			
		*/
		
		//Comparator<String> comp = (o1, o2) -> { return (o1.compareTo(o2) > 0 ? -1 : 1);};
		
		Comparator<String> comp = (o1, o2) -> (o1.compareTo(o2) > 0 ? -1 : 1);
		
		Collections.sort(names, comp);

		System.out.println(names);
		System.out.println();
	}

}
