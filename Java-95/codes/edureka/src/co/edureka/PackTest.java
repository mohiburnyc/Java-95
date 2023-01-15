package co.edureka;

import co.edureka.pack.Nums;

public class PackTest {

	public static void main(String[] args) {
		Nums obj = new Nums();
		
		obj.add(24, 12);
		System.out.println("diff = " + obj.sub(10,20));
	}

}
