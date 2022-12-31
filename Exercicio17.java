package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio17 {
	
	public static void main(String args[]) {
		
		/*
		 * Ler uma temperatura em graus Celsius e apresentá-la 
		 * convertida em graus Fahrenheit. A fórmula de conversão é 
		 * F = (9*C + 160)/5, sendo F a temperatura em Fahrenheit e 
		 * C a temperatura em Celsius.
		 */
		
		double grausC, grausFah;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Infome a temperatura em °C: ");
		grausC = scanner.nextDouble();
		
		grausFah = ((9*grausC) + 160) / 5;
		
		System.out.println("Fahrenheit: "+grausFah+"°");
		
		scanner.close();
	}

}
