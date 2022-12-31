package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio42 {
	
	public static void main(String[] args) {
		
		/*
		 * Temos que contruir uma calculadora onde o
		 * usuario informa dois valores e também 
		 * informa o simbolo da operacao, como:
		 * + - * / %
		 * observacao: Não se pode utilizar estruturas
		 * de controle, o exercicio deve ser feito
		 * apenas com operacao de atribuicao condicional,
		 * que nada mais e do que o operador ternario.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		double valor1, valor2, res;
		String operacao;
		
		System.out.println("Informe um valor: ");
		valor1 = scanner.nextDouble();
		
		System.out.println("Informe mais um valor: ");
		valor2 = scanner.nextDouble();
		
		System.out.println("Digíte o símbolo da operação: \n+ - * / %");
		operacao = scanner.next();
		
		res = operacao.equals("+") ? valor1 + valor2 : 0;
		res = operacao.equals("-") ? valor1 - valor2 : res;
		res = operacao.equals("*") ? valor1 * valor2 : res;
		res = operacao.equals("/") ? valor1 / valor2 : res;
		res = operacao.equals("%") ? valor1 % valor2 : res;
		
		System.out.printf("%.1f %s %.1f = %.1f", valor1, operacao, valor2, res);
		
		scanner.close();
	}

}
