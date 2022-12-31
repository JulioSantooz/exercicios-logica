package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio40 {
	
	public static void main(String[] args) {
		
		/*
		 * Criar um programa que receba duas notas parciais, 
		 * calcular a média final. Se a nota do aluno for 
		 * maior ou igual a 7.0 imprime no console "Aprovado", 
		 * se a nota for menor que 7.0 e maior do que 4.0 imprime 
		 * no console "Recuperação", caso contrário imprime no 
		 * console "Reprovado".
		 */
		
		double primeiraNotaParcial, segundaNotaParcial, mediaFinal;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		primeiraNotaParcial = entrada.nextDouble();

		System.out.println("Informe a segunda nota: ");
		segundaNotaParcial = entrada.nextDouble();
		
		mediaFinal = (primeiraNotaParcial + segundaNotaParcial) / 2;
		
		if(mediaFinal >= 7.0) {
			System.out.println("APROVADO!");
		}else if(mediaFinal < 7.0 && mediaFinal > 4.0) {
			System.out.println("RECUPERAÇÃO!");
		}else {
			System.out.println("REPROVADO!");
		}
		
		entrada.close();
	}

}
