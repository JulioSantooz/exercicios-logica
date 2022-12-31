package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio27 {
	
	public static void main(String args[]) {
		
		/*
		 * Elaborar um programa que efetue a apresentação do valor 
		 * da conversão em dólar de um valor lido em real. O programa 
		 * deve solicitar o valor da cotação do dólar e também a 
		 * quantidade de reais disponível com o usuário, para que seja 
		 * apresentado o valor em moeda americana.
		 */
		
		double valorCotacaoDolar, quantReal, dolar;
		double umReal = 1, realParaDolar;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a cotação do dolar: ");
		valorCotacaoDolar = scanner.nextDouble();
		
		System.out.println("Informe a quantidade de R$ que você quer converter: ");
		quantReal = scanner.nextDouble();
		
		realParaDolar = umReal / valorCotacaoDolar;
		
		dolar = quantReal * realParaDolar;
		
		System.out.printf("Foi convertido R$%.2f para $%.2f",quantReal,dolar);
		
		scanner.close();
	}

}
