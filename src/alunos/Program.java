package alunos;

import java.util.Scanner;

import alunos.menus.ItemDeMenu;
import alunos.menus.inserirAluno;
import alunos.menus.listarAluno;
import alunos.menus.sair;

public class Program {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		ItemDeMenu[] principal = new ItemDeMenu[] { new inserirAluno(), 
											        new listarAluno(), 
											        new sair() 
											      };

		boolean sair = false;
		do {
			for (int i = 0; i < principal.length; i++) {
				System.out.println(i + " - " + principal[i].getDescricao());
			}
			System.out.println("Qual a opção desejada? ");
			int opcao = Integer.parseInt(console.nextLine());

			sair = principal[opcao].executar();
		} while (!sair);
	}

}
