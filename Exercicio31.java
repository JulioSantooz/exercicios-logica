package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio31 {
	
	public static void main(String args[]) {
		
		/*
		 * Apresentar os resultados de uma tabuada de multiplicar 
		 * (de 1 até 10) de um número qualquer.
		 */
		
		int cont = 1, numTabuada, res;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-----------TABUADA-----------");
		
		System.out.println("\nInforme um número para que seja feita a tabuada do mesmo: ");
		numTabuada = scanner.nextInt();
		
		while(cont <= 10) {
			res = cont * numTabuada;
			System.out.println(cont+" X "+numTabuada+" = "+res);
			cont++;
		}
		
		scanner.close();
	}

}
