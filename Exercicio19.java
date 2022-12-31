package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio19 {
	
	public static void main(String args[]) {
		
		/*
		 * Calcular e apresentar o valor do volume de uma lata de óleo, 
		 * utilizando a fórmula: Volume = π*Raio2*Altura
		 */
		
		final double PI = 3.14159;
		double raio, altura, volume;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor do raio da lata de oleo: ");
		raio = scanner.nextDouble();
		
		System.out.println("Informe a altura da lata de oleo: ");
		altura = scanner.nextDouble();
		
		volume = PI*Math.pow(raio, raio)*altura;
		
		System.out.println("O volume da lata é: "+volume);
		
		scanner.close();
	}

}
