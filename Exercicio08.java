package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main(String args[]) {
		
		/*
		 * Escreva um algoritmo para ler as dimensões de um triângulo 
		 * (base e altura), calcular e escrever a área do triângulo. Dica a=b.h/2
		 */
		
		int base, altura, area;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a base do triângulo: ");
		base = scanner.nextInt();
		
		System.out.println("Informe a altura do triângulo: ");
		altura = scanner.nextInt();
		
		area = (base*altura)/2;
		
		System.out.println("Área: "+area);
		
		scanner.close();
	}

}
