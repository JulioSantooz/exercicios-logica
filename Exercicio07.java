package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String args[]) {
		
		/*
		 * Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), 
		 * calcular e escrever a área do retângulo. Dica a=b.h
		 */
		
		int area, base, altura; 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a base do retângulo: ");
		base = scanner.nextInt();
		
		System.out.print("Informe a altura do retângulo: ");
		altura = scanner.nextInt();
		
		area = base*altura;
		
		System.out.println("Área: "+area);
		
		scanner.close();
	}

}
