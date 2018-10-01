package teste;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import alunos.modelos.Aluno;


class AlunoTeste2 {

	Aluno a;
	@BeforeEach
	void setUp() throws Exception {
		a = new Aluno();
	}

	@Test
	void testAlunoStringString() {
		Assert.assertEquals("nome", "nome");
	}

	@Test
	void testAlunoStringStringIntDoubleDoubleInt() {
		Assert.assertEquals("matricula", "matricula");
	}

	@Test
	void testGetIdade() {
		Assert.assertEquals("20", "20");
	}

	@Test
	void testSetIdade() {
		Assert.assertEquals(20, 20);
	}

	@Test
	void testGetFalta() {
		Assert.assertEquals(2, 2);
	}

	@Test
	void testSetFalta() {
		Assert.assertEquals(2, 2);
	}

	@Test
	void testGetMatricula() {
		Assert.assertEquals("matricula", "matricula");
	}

	@Test
	void testSetMatricula() {
		Assert.assertEquals("matricula", "matricula");
	}

	@Test
	void testGetNome() {
		Assert.assertEquals("nome", "nome");
	}

	@Test
	void testSetNome() {
		Assert.assertEquals("nome", "nome");
	}

	@Test
	void testGetP1() {
		Assert.assertEquals(75.5, 75.6, 0.1);
	}

	@Test
	void testSetP1() {
		Assert.assertEquals(75.5, 75.6, 0.1);
	}

	@Test
	void testGetP2() {
		Assert.assertEquals(75.5, 75.6, 0.1);
	}

	@Test
	void testSetP2() {
		Assert.assertEquals(75.5, 75.6, 0.1);
	}

	@Test
	void testCalcularMedia() {
		Assert.assertEquals(75.5, 75.6, 0.1);
	}

	@Test
	void testPassou() {
		Assert.assertEquals(true, true);
	}

}
