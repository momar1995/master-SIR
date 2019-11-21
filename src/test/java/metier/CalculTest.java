package metier;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class CalculTest extends TestCase{

	@Test
	public void testAddition() {
		int a=5;
		int b=Calcul.addition(2,3);
		assertEquals(a,b);
	}

	@Test
	public void testMultiplication() {
		int a=6;
		int b=Calcul.multiplication(2,3);
		assertEquals(a,b);
	}

}
