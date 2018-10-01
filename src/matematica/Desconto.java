package matematica;

import java.util.Scanner;

public class Desconto {
	
	public static void main(String[] args) {
		System.out.println("Digite o valor do projeto: ");
		Scanner projeto = new Scanner(System.in);
		int proj = projeto.nextInt();
		
		System.out.println("Digite a porcentagem de desconto: ");
		Scanner porcentagem = new Scanner(System.in);
		int porcent = porcentagem.nextInt();
		
		
		int desconto = proj-porcent;
		System.out.println("O desconto de "+ proj + " é " + desconto);
	}
	
}


