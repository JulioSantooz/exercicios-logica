package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio24 {
	
	public static void main(String args[]) {
		
		/*
		 * Elaborar um programa que calcule e apresente o volume 
		 * de uma caixa retangular, por meio da fórmula 
		 * VOLUME=COMPRIMENTO * LARGURA * ALTURA.
		 */
		
		double VOLUME, COMPRIMENTO, LARGURA, ALTURA;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o comprimento da caixa: ");
		COMPRIMENTO = scanner.nextDouble();
		
		System.out.println("Informe a largura da caixa: ");
		LARGURA = scanner.nextDouble();
		
		System.out.println("Informe a altura da caixa: ");
		ALTURA = scanner.nextDouble();
		
		VOLUME = COMPRIMENTO * LARGURA * ALTURA;
		
		System.out.printf("O volume da caixa é: %.2f",VOLUME);
		
		scanner.close();
	}

}
