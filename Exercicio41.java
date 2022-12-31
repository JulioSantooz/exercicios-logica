package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio41 {
	
	public static void main(String[] args) {
		
		/*
		 * Escreva um programa que calcule a media dos ultimos 
		 * 3 salarios de um funcionario. Esses salarios tem que 
		 * ser armazenador em Strings e o funcionario tem a 
		 * liberdade de poder informar os valores separando as
		 * casas decimais com ',' ou '.' 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		String valor1, valor2, valor3;
		Double valor1Conv, valor2Conv, valor3Conv;
		double media;
		
		System.out.println("Informe o seu ultimo salário: ");
		valor1 = scanner.next().replace(",", ".");
		
		System.out.println("Informe o seu ultimo salário: ");
		valor2 = scanner.next().replace(",", ".");
		
		System.out.println("Informe o seu ultimo salário: ");
		valor3 = scanner.next().replace(",", ".");
		
		valor1Conv = Double.parseDouble(valor1);
		valor2Conv = Double.parseDouble(valor2);
		valor3Conv = Double.parseDouble(valor3);
		
		media = (valor1Conv + valor2Conv + valor3Conv) / 3;
		
		System.out.printf("A média dos 3 ultimos salários é: R$%.2f.",media);
		
		scanner.close();
	}

}
