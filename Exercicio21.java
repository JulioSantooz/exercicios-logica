package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio21 {
	
	public static void main(String args[]) {
		
		/*
		 * Efetuar o cálculo e a apresentação do valor de uma prestação 
		 * em atraso, utilizando a fórmula PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO).
		 */
		
		double prestacao, valor, taxa, tempo;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor da PRESTAÇÃO: ");
		valor = scanner.nextDouble();
		
		System.out.println("Informe o valor da TAXA:");
		taxa = scanner.nextDouble();
		

		System.out.println("Informe quanto tempo de atraso em dias: ");
		tempo = scanner.nextDouble();
			
		prestacao = valor + (valor*taxa/100) * tempo;
		
		System.out.printf("O valor da prestação em atraso é: R$%.2f",prestacao);
		
		scanner.close();
	}

}
