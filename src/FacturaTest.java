import static org.junit.Assert.*;

import org.junit.Test;


public class FacturaTest {

	Factura f = new Factura();
	@Test
	public void testGetCodFactura() {
		f.setCodCompanie("112456");
		assertEquals("112456", f.getCodCompanie());
	}

	@Test
	public void testSetCodFactura() {
		f.setCodCompanie("112456");
		assertEquals("112456", f.getCodCompanie());
	}

}
