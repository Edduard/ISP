import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Alex
 *
 */
public class UtilizatorTest {

	/**
	 * Test method for {@link Utilizator#getNume()}.
	 */
	Utilizator utilizator = new Utilizator("ion123","123","a",1);
	
	@Test
	public void testGetNume() {
		
		utilizator.setNume("Popescu");
		assertEquals(utilizator.getNume(),"Popescu");
		
	}

	/**
	 * Test method for {@link Utilizator#setNume(java.lang.String)}.
	 */
	@Test
	public void testSetNume() {
		utilizator.setNume("Popescu");
		assertEquals(utilizator.getNume(),"Popescu");
	}

	/**
	 * Test method for {@link Utilizator#getPrenume()}.
	 */
	@Test
	public void testGetPrenume() {
		utilizator.setPrenume("Alex");
		assertEquals(utilizator.getPrenume(),"Alex");
	}

	/**
	 * Test method for {@link Utilizator#setPrenume(java.lang.String)}.
	 */
	@Test
	public void testSetPrenume() {
		utilizator.setPrenume("Alex");
		assertEquals(utilizator.getPrenume(),"Alex");
		
	}

}