package matematica;

import java.util.Scanner;

public class Dobro {
	
	public static void main(String[] args) {
		System.out.println("Digite um nº: ");
		Scanner teclado = new Scanner(System.in);
		int num = teclado.nextInt();
		int dobro = 2*num;
		System.out.println("O dobro de "+ num + " é " + dobro);
	}

}
