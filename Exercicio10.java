package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String args[]) {
		
		/*
		 * Escreva um algoritmo para ler as dimensões de um 
		 * losango (diagonal maior, diagonal menor), calcular e 
		 * escrever a área do losango. Dica a=D.d/2
		 */
		
		int D,d,area;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a diagonal maior: ");
		D = scanner.nextInt();
		
		System.out.println("Informe a diagonal menor: ");
		d = scanner.nextInt();
		
		area = (D*d)/2;
		
		System.out.println("A área do losango é: "+area);
		
		scanner.close();
	}

}
