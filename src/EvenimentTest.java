import static org.junit.Assert.*;

import org.junit.Test;


public class EvenimentTest {

	@Test
	public void testGetNume() {
		Eveniment ev = new Eveniment();
		ev.nume = "ala";
		assertEquals(ev.getNume(), "ala"); 
	}

	@Test
	public void testSetNume() {
		Eveniment ev = new Eveniment();
		ev.setNume("ala");
		assertEquals(ev.nume, "ala"); 
	}

}
