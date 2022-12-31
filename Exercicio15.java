package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio15 {
	
	public static void main(String args[]) {
		
		/*
		 * Escreva um algoritmo para ler o salário mensal atual 
		 * de um funcionário e o percentual de reajuste. Calcular 
		 * e escrever o valor do novo salário.
		 */
		
		double salarioAtualFunc, novoSalarioFunc, percReajuste;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o salário atual: ");
		salarioAtualFunc = scanner.nextDouble();
		
		System.out.println("Informe o percentual de reajuste: ");
		percReajuste = scanner.nextDouble();
		
		novoSalarioFunc = ((percReajuste / 100) * salarioAtualFunc) + salarioAtualFunc;
		
		System.out.println("O novo sálário é: R$"+novoSalarioFunc);
		
		scanner.close();
	}

}
