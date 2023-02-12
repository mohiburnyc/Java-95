package co.edureka.services;

public class TestApp {

	public static void main(String[] args) throws Exception {
		NumsServiceLocator locator = new NumsServiceLocator();
		Nums ref = locator.getNums();
		
		int x = 12;
		int y = 13;
		
		int s = ref.add(x, y);
		System.out.println(x + " + " + y + " = " + s);
	}

}
