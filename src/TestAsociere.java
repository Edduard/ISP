import static org.junit.Assert.*;

import org.junit.Test;


public class TestAsociere {
	
	Eveniment eveniment = new Eveniment();
	Companie companie = new Companie();
	protected void setUp() throws Exception{
		companie.setNume("Intel");
		companie.setOras("Bucuresti");
		eveniment.setNume("EBEC");
		eveniment.setLocatie("Bucuresti");
		eveniment.adaugarePartener(companie);
	}
	
	@Test
	public void testareAsociereCompanie() {
		for (Companie comp: eveniment.getParteneri()){
			assertSame(comp, companie);
			if (comp == companie) assertEquals(comp.getAdresa(), "Bucuresti");
		}
	}

}
