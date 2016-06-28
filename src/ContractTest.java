import static org.junit.Assert.*;

import org.junit.Test;


public class ContractTest {

	Contract c = new Contract();
	@Test
	public void testGetSuma() {
		c.setSuma("55");
		assertEquals("55", c.getSuma());
	}

	@Test
	public void testSetSuma() {
		c.setSuma("55");
		assertEquals("55", c.getSuma());
	}

}
