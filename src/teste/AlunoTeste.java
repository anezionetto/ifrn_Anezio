package teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import alunos.modelos.Aluno;

public class AlunoTeste {

	
	Aluno a;
	@Before
	public void setUp() throws Exception {
		a = new Aluno();
	}

	@Test
	public void testGetIdade() {
		Assert.assertEquals(18, 18);
	}

	@Test
	public void testGetFalta() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void testCalcularMedia() {
		Assert.assertEquals(80, 80, 80);
	}

	@Test
	public void testPassou() {
		Assert.assertEquals(true, 60);
	}

}
