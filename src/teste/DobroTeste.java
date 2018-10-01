package teste;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import matematica.Dobro;

class DobroTeste {
	
	Dobro d;
	@BeforeEach
	void setUp() throws Exception {
		d = new Dobro();
	}

	@Test
	void testMain() {
		Assert.assertEquals(4, 2);
	}

}
