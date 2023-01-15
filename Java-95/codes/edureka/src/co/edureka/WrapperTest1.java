package co.edureka;

public class WrapperTest1 {

	public static void main(String[] args) {
		Integer i1 = new Integer(25);
		Integer i2 = new Integer("25");
		
		Integer i3 = Integer.valueOf(25);
		Integer i4 = Integer.valueOf("25");
		System.out.println(i1+" | "+i2+" | "+i3+" | "+i4);
		
		Character c1 = new Character('A');
		Character c2 = Character.valueOf('A');
		System.out.println(c1+" | "+c2);
		
		int n1 = 26;
		Integer n2 = n1; //boxing
		int n3 = n2; //un-boxing
		System.out.println(n1+" | "+n2+" | "+n3);
	}
}