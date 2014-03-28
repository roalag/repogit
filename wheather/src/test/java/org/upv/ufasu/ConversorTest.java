package org.upv.ufasu;

import junit.framework.TestCase;
import org.upv.ufasu.weather.TemperatureConversor;

public class ConversorTest extends TestCase {

	public ConversorTest(String name) {
		super(name);
	}
	
	static String gradosC = "10";
	static String gradosF = "50";
	public void testConv() throws Exception {
		String temp = TemperatureConversor.deFaC(gradosF);
		assertEquals(temp,gradosC);
		
	}
}
