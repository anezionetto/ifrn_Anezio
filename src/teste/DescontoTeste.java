package teste;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import matematica.Desconto;

class DescontoTeste {

	Desconto  d;
	@BeforeEach
	void setUp() throws Exception {
		d = new Desconto();
	}

	@Test
	void testMain() {
		Assert.assertEquals(80, 100);
	}

}
