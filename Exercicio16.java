package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio16 {
	
	public static void main(String args[]) {
		
		/*
		 * O custo de um carro novo ao consumidor é a soma do 
		 * custo de fábrica com a porcentagem do distribuidor e dos 
		 * impostos (aplicados ao custo de fábrica). Supondo que o 
		 * percentual do distribuidor seja de 28% e os impostos de 45%, 
		 * escrever um algoritmo para ler o custo de fábrica de um carro, 
		 * calcular e escrever o custo final ao consumidor.
		 */
		
		final double PORC_DISTRIBUIDOR = 0.28, IMPOSTOS = 0.45;
		double custoFabrica, custoFinal;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o custo de fábrica do carro: ");
		custoFabrica = scanner.nextDouble();
		
		custoFinal = (custoFabrica * (PORC_DISTRIBUIDOR + IMPOSTOS)) + custoFabrica;
		
		double porcDistriAjustada = (PORC_DISTRIBUIDOR * 100);
		double porcentagemAjustada = (IMPOSTOS * 100);
		
		System.out.println("\n///////////////////////////////");
		System.out.println("Custo de fábrica: R$"+custoFabrica+".");
		System.out.printf("Porcentagem do distribuidor: %.1f %n",porcDistriAjustada);
		System.out.printf("Porcentagem de impostos: %.1f %n",porcentagemAjustada);
		System.out.println("O custo final é: R$"+custoFinal+".");
				
		scanner.close();
	}

}
