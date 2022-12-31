package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio22 {
	
	public static void main(String args[]) {
		
		/*
		 * Ler dois valores (inteiros, reais ou caracteres) para as 
		 * variáveis A e B, e efetuar a troca dos valores de forma que a 
		 * variável A passe a possuir o valor da variável B e a variável B 
		 * passe a possuir o valor da variável A. Apresentar os valores trocados.
		 */
		
		int A,B,C;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um valor Inteiro para a variável A: ");
		A = scanner.nextInt();
		
		System.out.println("Informe mais um valor Inteiro para a variaável B: ");
		B = scanner.nextInt();
		
		System.out.println("O Valor da variável A é: "+A);
		System.out.println("O valor da variável B é: "+B);
		
		System.out.println("\n///////////////////////");
		System.out.println("Trocando os valores das variáveis... ");
		
		C = A;
		A = B;
		B = C;
		
		System.out.println("\nO Valor da variável A é: "+A);
		System.out.println("O valor da variável B é: "+B);
		
		scanner.close();
	}

}
