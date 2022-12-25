
public class ConditionalOperator {

	public static void main(String[] args) {
		//int x = 10;
		int x = 25;
		int y = 20;
		
		int lar = (x > y) ? x : y;
		
		//largest of (25, 20) = 25
		System.out.println("largest of (" + x +", " + y + ") = " + lar);
	}
}