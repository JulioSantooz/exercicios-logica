package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String args[]) {
		
		/*
		 * Escreva um algoritmo para ler um valor do teclado 
		 * e exibir como resposta o número antecessor.
		 */
		
		int num,lastNum;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digíte um número: ");
		num = scanner.nextInt();
		
		lastNum = num;
		num--;
		
		System.out.println("O numero antecessor de "+lastNum+" é: "+num);
		
		scanner.close();
	}

}
