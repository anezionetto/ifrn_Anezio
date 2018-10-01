package alunos.modelos;

public class Aluno {

	private String matricula, nome;
	private double p1, p2;
	private int idade, falta;

	public Aluno(String matricula, String nome) {
		this(matricula, nome, 0, 0, 0, 0);
	}

	public Aluno(String matricula, String nome, int idade, double p1, double p2, int falta) {
		this.matricula = matricula;
		this.nome = nome;
		this.idade = idade;
		this.p1 = p1;
		this.p2 = p2;
		this.falta = falta;
	}

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getFalta() {
		return falta;
	}

	public void setFalta(int falta) {
		this.falta = falta;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getP1() {
		return p1;
	}

	public void setP1(double p1) {
		this.p1 = p1;
	}

	public double getP2() {
		return p2;
	}

	public void setP2(double p2) {
		this.p2 = p2;
	}

	public double calcularMedia() {
		return (p1 + p2) / 2;
	}

	public boolean passou() {
		return calcularMedia() >= 60;
	}

}
