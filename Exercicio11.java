package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main(String args[]) {
		
		/*
		 * Escreva um algoritmo para ler as dimensões de um trapézio 
		 * (base maior, base menor e altura), calcular e escrever a área do trapézio. 
		 * a=(B+b).h/2
		 */
		
		int B,b,altura,area;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a base maior: ");
		B = scanner.nextInt();
		
		System.out.println("Informe a base menor: ");
		b = scanner.nextInt();
		
		System.out.println("Informe a altura: ");
		altura = scanner.nextInt();
		
		area = (B+b) * (altura/2);
		
		System.out.println("A área do trapézio é: "+area);
		
		scanner.close();
	}

}
