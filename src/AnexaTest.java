import static org.junit.Assert.*;

import org.junit.Test;


public class AnexaTest {

	Anexa a = new Anexa();
	@Test
	public void testIsAfis() {
		a.setAfis(true);
		assertEquals(true, a.isAfis());
	}

	@Test
	public void testSetAfis() {
		a.setAfis(true);
		assertEquals(true, a.isAfis());
	}

}
