package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio18 {
	
	public static void main(String args[]) {
		
		/*
		 * Ler uma temperatura em graus Fahrenheit e apresentá-la 
		 * convertida em graus Celsius. A fórmula deconversão é C=(F-32)*(5/9), 
		 * sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
		 */

		double f, c;
		final int AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em °F: ");
		f = scanner.nextDouble();
		
		c = (f - AJUSTE) * FATOR; 
		
		System.out.printf("O resultado é: %.1f°C.",c);
		
		scanner.close();
		
	}

}
