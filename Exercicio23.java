package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio23 {
	
	public static void main(String args[]) {
		
		/*
		 * Ler quatro números inteiros e apresentar o resultado da 
		 * adição e multiplicação, baseando-se na utilização do 
		 * conceito da propriedade distributiva. Ou seja, se forem 
		 * lidas as variáveis A, B, C, e D, devem ser somadas e 
		 * multiplicadas A com B, A com C e A com D. 
		 * Depois B com C, B com D e por fim C com D. 
		 * Perceba que será necessário efetuar seis operações de 
		 * adição e seis operações de multiplicação e apresentar 
		 * doze resultados de saída.
		 */
		
		int A,B,C,D;
		int vetor[];
		int somaDistributiva, multiDistributiva;

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um valor inteiro para as variáveis (A,B,C,D)");
		
		System.out.println("\nInforme o valor da variável A: ");
		A = scanner.nextInt();
		
		System.out.println("Informe o valor da variável B: ");
		B = scanner.nextInt();
		
		System.out.println("Informe o valor da variável C: ");
		C = scanner.nextInt();
		
		System.out.println("Informe o valor da variável D: ");
		D = scanner.nextInt();
		
		vetor = new int[4];
		
		vetor[0] = A;
		vetor[1] = B;
		vetor[2] = C;
		vetor[3] = D;
		
		System.out.println("-------------Variáveis-------------");
		System.out.println("\nA: "+A);
		System.out.println("B: "+B);
		System.out.println("C: "+C);
		System.out.println("D: "+D+"\n");
		
		for(int i = 0; i <= 3; i++) {
			if(i == 0 ) {
				for(int j = 1; j <= 3; j++) {
					//System.out.println("("+i+","+j+")");
					somaDistributiva = vetor[i] + vetor[j];
					multiDistributiva = vetor[i] * vetor[j];
					System.out.println(vetor[i]+" + "+vetor[j]+" = "+somaDistributiva);
					System.out.println(vetor[i]+" X "+vetor[j]+" = "+multiDistributiva);
				}
			}
			if(i == 1) {
				for(int j = 2; j <= 3; j++) {
					//System.out.println("("+i+","+j+")");
					somaDistributiva = vetor[i] + vetor[j];
					multiDistributiva = vetor[i] * vetor[j];
					System.out.println(vetor[i]+" + "+vetor[j]+" = "+somaDistributiva);
					System.out.println(vetor[i]+" X "+vetor[j]+" = "+multiDistributiva);
				}
			}
			if(i == 2) {
				for(int j = 3; j <= 3; j++) {
					//System.out.println("("+i+","+j+")");
					somaDistributiva = vetor[i] + vetor[j];
					multiDistributiva = vetor[i] * vetor[j];
					System.out.println(vetor[i]+" + "+vetor[j]+" = "+somaDistributiva);
					System.out.println(vetor[i]+" X "+vetor[j]+" = "+multiDistributiva);
				}
			}
		}

		scanner.close();
	}

}
