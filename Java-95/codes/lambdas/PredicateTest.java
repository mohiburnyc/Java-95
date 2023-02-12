package co.edureka.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		int num = 24;
		
		Predicate<Integer> predicate = t -> (t%2)==0;
		
		boolean result = predicate.test(num);
		System.out.println(num +" is Even = " + result);
		
		System.out.println();
		
		List<Integer> nums = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		
		nums.stream().filter(t -> t%2 == 0).forEach(t -> System.out.print(t +"   "));;
	}

}
