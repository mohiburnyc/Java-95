package com.w3schools.www.xml;

public class TestApp {

	public static void main(String[] args) throws Exception {
		TempConvertLocator locator = new TempConvertLocator();
		TempConvertSoap soap = locator.getTempConvertSoap();
		
		String cel = "37";
		String fah = soap.celsiusToFahrenheit(cel);
		
		System.out.println(cel+"C = " + fah+"F");
	}
}
