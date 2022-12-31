package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio12 {
	
	public static void main(String args[]) {
		
		/*
		 * Escreva um algoritmo para ler as dimensões de um 
		 * circulo (raio), calcular e escrever a área do circulo. a=pi*r²
		 */
		
		double raio, area;
		final float PI = (float)3.14159;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o raio do circulo: ");
		raio = scanner.nextDouble();
		
		area = PI * Math.pow(raio, 2);
		
		System.out.printf("A área é: %.2f",area);
		
		scanner.close();
	}

}
