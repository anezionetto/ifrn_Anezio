package matematica;

import java.util.Scanner;

public class ConsumoMedio {
	
	public static void main(String[] args) {
		System.out.println("Digite a distância percorrida: ");
		Scanner distancia = new Scanner(System.in);
		int dist = distancia.nextInt();
		
		System.out.println("Digite o total de combustível gasto: ");
		Scanner combustivel = new Scanner(System.in);
		int comb = combustivel.nextInt();
		
		if(comb != 0) {
		int rendimento = dist/comb;
		System.out.println("O rendimento é " + rendimento);
		}else {
			System.out.println("Rendimento impossível.");
		}
	}
	
}


