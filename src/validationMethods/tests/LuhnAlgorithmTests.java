package validationMethods.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import validationMethods.LuhnAlgorithm;

public class LuhnAlgorithmTests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void isValid() {
		LuhnAlgorithm la = new LuhnAlgorithm();
		assertTrue(la.isValid("3379513561108795"));
	}

}
