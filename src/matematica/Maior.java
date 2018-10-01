package matematica;

import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int maior = 0, aux;
		int num[] = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite um número: ");
			num[i] = ler.nextInt();
			aux = num[i];
			
			if (maior < aux) {
				maior = num[i];
			}
		}
		System.out.println("O maior dos três números é: " + maior);
	}
}
