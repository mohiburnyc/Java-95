package co.edureka;

public class WrapperTest2 {

	public static void main(String[] args) {
		Integer in = Integer.valueOf(12);
		
		byte b = in.byteValue();
		short s = in.shortValue();
		int n = in.intValue();
		long l = in.longValue();
		float f = in.floatValue();
		double d = in.doubleValue();
		
		System.out.println(b+" | "+s+" | "+n+" | "+l);
		System.out.println(f+" | "+d);
		
		n = 255;
		System.out.println("binary form of "+n+" = " + Integer.toBinaryString(n));
		System.out.println("octa form of "+n+" = " + Integer.toOctalString(n));
		System.out.println("hexa form of "+n+" = " + Integer.toHexString(n));
	}
}