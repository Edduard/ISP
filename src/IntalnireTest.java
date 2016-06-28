import static org.junit.Assert.*;

import org.junit.Test;


public class IntalnireTest {

	Intalnire i = new Intalnire();
	@Test
	public void testGetId() {
		i.setId(2);
		assertEquals(2, i.getId());
	}

	@Test
	public void testSetId() {
		i.setId(2);
		assertEquals(2, i.getId());
	}

}
