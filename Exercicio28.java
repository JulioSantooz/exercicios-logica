package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio28 {
	
	public static void main(String args[]) {
		
		/*
		 * Elaborar um programa que efetue a leitura de três valores 
		 * (A, B e C) e apresente como resultado final à soma dos 
		 * quadrados dos três valores lidos.
		 */
		
		int A, B, C, resultado;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor de A: ");
		A = entrada.nextInt();
		
		System.out.println("Informe o valor de B: ");
		B = entrada.nextInt();
		
		System.out.println("Informe o valor de C: ");
		C = entrada.nextInt();
		
		resultado = (int) (Math.pow(A, 2) + Math.pow(B, 2) + Math.pow(C, 2));
		
		System.out.println("Resultado: "+resultado);
		
		entrada.close();
	}

}
