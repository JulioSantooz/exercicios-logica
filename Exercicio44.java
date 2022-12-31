package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio44 {
	
	public static void main(String[] args) {
		
		/*
		 * Criar um programa que calcula a média das notas de
		 * um aluno, o usuário deve informar a quantidade de 
		 * notas e em seguida passar o valor de cada nota. O 
		 * exercicio pode ser feito com apenas um loop, porém
		 * para fins dicaticos o exercicio deve ser feito com
		 * o laço for e um laço foreach para praticar.
		 */
		
		int quantNotas;
		double somaNotasInformadas = 0, media;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe quantas notas serão calculadas para a média: ");
		quantNotas = scanner.nextInt();
		
		double[] notas = new double[quantNotas];
		
		for(int cont = 0; cont < notas.length; cont++) {
			System.out.println("Informe a "+ (cont + 1) + "° nota: ");
			notas[cont] = scanner.nextDouble();
		}
		
		for(double nota: notas) {
			somaNotasInformadas += nota;
		}
		
		media = somaNotasInformadas / notas.length;
		
		System.out.println("A média é: "+media);
		
		scanner.close();
	}

}
