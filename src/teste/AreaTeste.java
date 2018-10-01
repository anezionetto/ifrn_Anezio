package teste;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import matematica.Area;

class AreaTeste {
	
	Area a;
	@BeforeEach
	void setUp() throws Exception {
		a = new Area();
	}

	@Test
	void test() {
		Assert.assertEquals(12, 3, 4);
	}

}
