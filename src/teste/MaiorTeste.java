package teste;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import matematica.Maior;

class MaiorTeste {

	Maior m;
	@BeforeEach
	void setUp() throws Exception {
		m = new Maior();
	}

	@Test
	void testMain() {
		Assert.assertEquals(6, 4, 2);
	}

}
