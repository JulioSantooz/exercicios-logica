package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio25 {
	
	public static void main(String args[]) {
		
		/*
		 * Ler dois inteiros (variáveis A e B) e imprimir o resultado 
		 * do quadrado da diferença do primeiro valor pelo segundo.
		 */
		
		int A, B, res;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor de A: ");
		A = scanner.nextInt();
		
		System.out.println("Informe o valor de B: ");
		B = scanner.nextInt();
		
		res =  (int) (Math.pow(A, A) - (2 * A * B) + Math.pow(B, B));
		
		System.out.println("Resposta: "+res);
		
		scanner.close();
	}

}
