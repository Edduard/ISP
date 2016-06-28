import static org.junit.Assert.*;

import org.junit.Test;


public class ActivitateTest {

	Activitate a = new Activitate();
	@Test
	public void testGetNume() {
		a.setNume("Mind Jam");
		assertEquals("Mind Jam", a.getNume());
	}

	@Test
	public void testSetNume() {
		a.setNume("Mind Jam");
		assertEquals("Mind Jam", a.getNume());
	}
}
