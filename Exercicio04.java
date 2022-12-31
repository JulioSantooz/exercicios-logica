package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String args[]) {
		
		/*
		 * Escreva um algoritmo para ler dois valores do 
		 * teclado e exibir como resposta a subtração dos valores.
		 */
		
		int val1,val2,sub;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digíte o primeiro valor: ");
		val1 = scanner.nextInt();
		
		System.out.println("Digíte o segundo valor: ");
		val2 = scanner.nextInt();
		
		sub = val1 - val2;
		
		System.out.println("Resposta: "+sub);
		
		scanner.close();
	}

}
