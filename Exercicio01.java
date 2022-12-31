package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String args[]) {
		
		/*
		 * Escreva um algoritmo para ler um valor do 
		 * teclado e exibir como resposta o número sucessor.
		 */
		
		int num, lastNum;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digíte um numero: ");
		num = scanner.nextInt();
		
		lastNum = num;
		num++;
		
		System.out.println("O numero sucessor de "+lastNum+ " é: "+num);
		
		scanner.close();
		
	}

}
