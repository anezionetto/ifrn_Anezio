package teste;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import matematica.ConsumoMedio;

class ConsumoMedioTeste {

	ConsumoMedio cm;
	@BeforeEach
	void setUp() throws Exception {
		cm = new ConsumoMedio();
	}

	@Test
	void testMain() {
		Assert.assertEquals(20, 200);
	}
}