package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio26 {
	
	public static void main(String args[]) {
		
		/*
		 * Elaborar um programa que efetue a apresentação do 
		 * valor da conversão em real de um valor lido em dólar. 
		 * O programa deve solicitar o valor da cotação do dólar 
		 * e também a quantidade de dólares disponível com o usuário, 
		 * para que seja apresentado o valor em moeda brasileira.
		 */
		
		double valorCotacaoDolar, quantDolares, real;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a cotação do Dolar: ");
		valorCotacaoDolar = scanner.nextDouble();
		
		System.out.println("Informe a quantidade de dolares que você quer converter para R$: ");
		quantDolares = scanner.nextDouble();
		
		real = valorCotacaoDolar * quantDolares;
		
		System.out.printf("Foi convertido $%.2f para R$%.2f",quantDolares,real);
		
		scanner.close();
	}

}
