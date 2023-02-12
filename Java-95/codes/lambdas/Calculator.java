package co.edureka.lambdas;

public class Calculator {

	public static void main(String[] args) {
		 Nums ref = (int x, int y) -> {return x + y; };
		 System.out.println("Sum = " + ref.add(10, 20));
		 
		 Nums ref1 = (x, y) -> x + y;
		 System.out.println("Sum = " + ref1.add(12, 22));
	}

}
