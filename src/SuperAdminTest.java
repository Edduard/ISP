import static org.junit.Assert.*;

import org.junit.Test;


public class SuperAdminTest {

	@Test
	public void testAdaugaUtilizator() {
		Utilizator utilizator = new Utilizator("ION123","abc123","rang",5);
		  utilizator.setNume("Popescu");
		  utilizator.setPrenume("Ion Marcu");
		  
			assertEquals(utilizator.getNume(),"Popescu");
	}

}