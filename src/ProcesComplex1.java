import static org.junit.Assert.*;

import org.junit.Test;


public class ProcesComplex1 {

	SuperAdmin sa = new SuperAdmin("Andrei", "abc123", "SuperAdmin", 0);
	Utilizator u1 = new Utilizator("Grigore", "aa1122", "Utilizator", 1);
	Utilizator u2 = new Utilizator("Bob", "aa11", "Utilizator", 2);
	@Test
	public void testAdaugaUtilizator() {
			sa.adaugaUtilizator(u1);
		for (Utilizator utiliz: sa.utilizatori){
			assertEquals("Grigore", utiliz.getUsername());
		}
		
	}

	@Test
	public void testModificaRangul() {
		sa.modificaRangul(u1, "Admin");
		for (Utilizator utiliz: sa.utilizatori){
			if (u1==utiliz) assertEquals(utiliz.getRang(), "Admin");
		}
		
		
	}

	@Test
	public void testAddPrieten() {
		u1.addPrieten(u2);
		for (Utilizator prieten: u1.getPrieteni()){
			if (u1==prieten) assertEquals(prieten.getNume(), "Bob");
		}
	}

	@Test
	public void testStergerePrietenUtilizator() {
		u1.stergerePrieten(u2);
		for (Utilizator prieten: u1.getPrieteni()){
			assertNotSame(prieten.getNume(), "Bob");
		}
	}
}
