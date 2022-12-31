package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String args[]) {
		
		/*
		 * Escreva um algoritmo para ler dois valores 
		 * do teclado e exibir como resposta a soma dos valores.
		 */
		
		int val1, val2,soma;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digíte o primeiro valor: ");
		val1 = scanner.nextInt();
		
		System.out.println("Digíte o segundo valor: ");
		val2 = scanner.nextInt();
		
		soma = val1 + val2;
		
		System.out.println("Resposta: "+soma);
		
		scanner.close();
	}

}
