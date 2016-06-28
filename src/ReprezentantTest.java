import static org.junit.Assert.*;

import org.junit.Test;


public class ReprezentantTest {

	Reprezentant r = new Reprezentant("Petru", "abc123", "Reprezentant", 5);
	@Test
	public void testGetRang() {
		assertEquals("Reprezentant", r.getRang());
	}

	@Test
	public void testSetPozitie() {
		r.setPozitie("Admin");
		assertEquals("Admin", r.getPozitie());
	}

	@Test
	public void testGetUsername() {
		assertEquals("Petru", r.getUsername());
	}
	@Test
	public void testSetNume(){
		r.setNume("ion");
		assertEquals("ion", r.getNume());
	}
	
	@Test
	public void testGetNume() {
		r.setNume("ion");
		assertEquals("ion", r.getNume());

	}

}
