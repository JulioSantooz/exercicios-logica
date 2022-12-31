package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio30 {
	
	public static void main(String args[]) {
		
		/*
		 * Ler o valor correspondente ao salário mensal (variável SM) 
		 * de um trabalhador e também o valor do percentual de reajuste 
		 * (variável PR) a ser atribuído. Apresentar o valor do novo 
		 * salário (variável NS).
		 */
		
		double SM, PR, NS;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o salário mensal: R$");
		SM = scanner.nextDouble();
		
		System.out.println("Informe o percentual de reajuste: %");
		PR = scanner.nextDouble();
		
		NS = ((PR / 100) * SM) + SM;
		
		System.out.println("//////////////////////");
		System.out.printf("\nSalário mensal: R$ %.2f",SM);
		System.out.println("\nPercentual de reajuste: %"+PR);
		System.out.printf("\nNovo salário: R$ %.2f",NS);
		
		scanner.close();
	}

}
