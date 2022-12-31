package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio29 {
	
	public static void main(String args[]) {
		
		/*
		 * Elaborar um programa que efetue a leitura de três valores 
		 * (A, B e C) e apresente como resultado final o quadrado da 
		 * soma dos três valores lidos.
		 */
		
		int a, b, c, somaValores, res;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		a = entrada.nextInt();
		
		System.out.println("Informe o segundo valor: ");
		b = entrada.nextInt();
		
		System.out.println("Informe o terceiro valor: ");
		c = entrada.nextInt();
		
		somaValores = a + b + c;
		
		res = (int) Math.pow(somaValores, 2);
		
		System.out.println("Resultado: "+res);
		
		entrada.close();
	}

}
