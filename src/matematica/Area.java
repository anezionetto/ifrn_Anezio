package matematica;

import java.util.Scanner;

public class Area {
	
	public static void main(String[] args) {
		System.out.println("Digite um lado do ret�ngulo: ");
		Scanner teclado = new Scanner(System.in);
		double base = teclado.nextDouble();
		
		System.out.println("Digite outro lado do ret�ngulo: ");
		Scanner teclado2 = new Scanner(System.in);
		double altura = teclado.nextDouble();
		
		double area = base*altura;
		System.out.println("A �rea do ret�ngulo � " + area);
	}

}
