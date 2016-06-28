import static org.junit.Assert.*;

import org.junit.Test;


public class ArticolTest {
	
	Articol a = new Articol();
	@Test
	public void testGetTitlu() {
		a.setTitlu("Recrutari");
		assertEquals("Recrutari", a.getTitlu());
	}

	@Test
	public void testSetTitlu() {
		a.setTitlu("Recrutari");
		assertEquals("Recrutari", a.getTitlu());
	}

}
