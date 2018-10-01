package alunos.menus;

import java.util.Scanner;

import alunos.modelos.Aluno;

public class inserirAluno extends ItemDeMenu {

	@Override
	public String getDescricao() {
		return "Inserir aluno.";
	}

	@Override
	public Boolean executar() {
		Scanner console = new Scanner(System.in);

		System.out.print("Matrícula: ");
		String matricula = console.nextLine();

		System.out.print("Nome: ");
		String nome = console.nextLine();
		int tamanho = nome.length();
		if(tamanho < 3) {
			System.out.println("O nome deve conter no mínimo 3 letras.");
		}
		
		System.out.println("Idade: ");
		int idade = Integer.parseInt(console.nextLine());
		if(idade < 18) {
			System.out.println("A idade mínima é 18 anos.");
		}

		System.out.print("Prova 1: ");
		double p1 = Double.parseDouble(console.nextLine());

		System.out.print("Prova 2: ");
		Double p2 = Double.parseDouble(console.nextLine());
		
		System.out.println("Faltas: ");
		int falta = Integer.parseInt(console.nextLine());
		if(falta < 0) {
			System.out.println("O número de faltas deve ser zero ou superior.");
		}
		
		
		Aluno aluno = new Aluno(matricula, nome);
		aluno.setIdade(idade);
		aluno.setP1(p1);
		aluno.setP2(p2);
		aluno.setFalta(falta);
		aluno.passou();

		dao.inserir(aluno);

		System.out.println("Aluno cadastrado com sucesso");

		return false;
	}

}
