import static org.junit.Assert.*;

import org.junit.Test;


public class BrosuraTest {

	@Test
	public void testGetDescriere() {
		Brosura b = new Brosura();
		b.descriere = "Descriere Mind Jam";
		assertEquals(b.getDescriere(), "Descriere Mind Jam");
	}

	@Test
	public void testSetDescriere() {
		Brosura b = new Brosura();
		b.setDescriere("Descriere Mind Jam");
		assertEquals(b.descriere, "Descriere Mind Jam");
	}

	@Test
	public void testAdaugaTipPachete() {
		Brosura b = new Brosura();
		b.adaugaTipPachete("Pachet1");
		
		for (String tip: b.tipuriPachete){
			assertEquals("Pachet1", tip);
		}
	}
}
