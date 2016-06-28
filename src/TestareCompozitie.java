import static org.junit.Assert.*;

import org.junit.Test;


public class TestareCompozitie {

	SuperAdmin sa = new SuperAdmin("Alin", "a1", "SuperAdmin", 0);
	Reprezentant r = new Reprezentant("Ion", "aa11", "Reprezentant", 4);
	Companie companie = new Companie();
	protected void setUp() throws Exception{
		companie.setNume("Intel");
		companie.setOras("Bucuresti");
		r.setNume("Ion");
		r.setPozitie("HR");
		r.setEmail("ion@intel.ro");
	}
	
	@Test
	public void setareReprezentant(){
		sa.asigneazaReprezentantCompaniei(r, companie);
		r.setNume("Pacala");
	}
	
	@Test
	public void testareCompozitie() {
		for (Reprezentant rep: companie.getReprezentanti()){
			assertSame(rep, r);
			if (r == rep) assertEquals(r.getNume(), "Ion");
		}
		assertNotSame(r.getNume(), "Ion");
	}

}
