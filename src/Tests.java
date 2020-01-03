import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;


public class Tests extends Main {
	
	Tests tests = new Tests();
	
	@Test
	public void test() {
		assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)", "Most Trees Are Blue", Tests.capitalFirstLetter("most trees are blue"));
	}
	
	@Test
	public void testNullArg() {
		assertNull("Must return null when the arg is null", Tests.capitalFirstLetter(null));
	}
	
	@Test
	public void testEmptyArg() {
		assertNull("Must return null when the arg is empty string", Tests.capitalFirstLetter(""));
	}
}
