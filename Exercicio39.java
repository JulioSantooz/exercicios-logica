package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio39 {
	
	public static void main(String[] args) {
		
		/*
		 * Criar um programa que receba um número e 
		 * verifique se ele está entre 0 e 10 e é par;
		 */
		
		int num, cont;
		boolean numEstaDentroDaEscala = false;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o número: ");
		num = entrada.nextInt();
		
		cont = 0;
		while(cont <= 10) {
			if((num == cont) && num % 2 == 0) {
				System.out.println("O número informado esta entre 0 e 10.");
				numEstaDentroDaEscala = true;
			}
			cont++;
		}
		
		if(numEstaDentroDaEscala == false) {
			System.out.println("O número informado não é par ou não esta entre 0 e 10.");
		}
		
		entrada.close();
	}

}
