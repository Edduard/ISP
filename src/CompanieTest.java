import static org.junit.Assert.*;

import org.junit.Test;


public class CompanieTest {
	
	Companie c = new Companie();
	@Test
	public void testGetNume() {
		c.setNume("Luxoft");
		assertEquals("Luxoft", c.getNume());
	}

	@Test
	public void testSetNume() {
		c.setNume("Luxoft");
		assertEquals("Luxoft", c.getNume());
	}

}
