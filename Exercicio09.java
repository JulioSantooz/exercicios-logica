package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio09 {
	
	public static void main(String args[]) {
		
		/*
		 * Escreva um algoritmo para ler as dimensões de um quadrado (lado), 
		 * calcular e escrever a área do quadrado. Dica a=l²
		 */
		
		int lado, area;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe as dimensões do quadrado: ");
		lado = scanner.nextInt();
		
		//area = lado * lado;
		
		area =  (int) Math.pow(lado, 2);
		
		System.out.println("Área: "+area);
		
		scanner.close();
	}

}
