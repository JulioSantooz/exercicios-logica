package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String args[]) {
		
		/*
		 * Escreva um algoritmo para ler dois valores do 
		 * teclado e exibir como resposta a divisão dos valores.
		 */
		
		int val1, val2, div;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		val1 = scanner.nextInt();
		
		System.out.println("Informe o segundo valor: ");
		val2 = scanner.nextInt();
		
		div = val1/val2;
		
		System.out.println("Resposta: "+div);
		
		scanner.close();
	}

}
