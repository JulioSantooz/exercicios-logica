package ExerciciosLogica;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio45 {
	
	public static void main(String[] args) {
		
		/*
		 * O programa deve calcular a média geral de uma sala 
		 * de alunos, e para isso o usuário deve informar 
		 * quantos alunos terão as suas notas somadas e o
		 * usuário também deve informar quantas notas cada 
		 * aluno possui.
		 */
		
		int quantAlunos, quantNotas;
		double totalNota = 0, media;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de alunos: ");
		quantAlunos = scanner.nextInt();
		
		System.out.print("Informe a quantidade de notas: ");
		quantNotas = scanner.nextInt();
		
		double[][] notas = new double[quantAlunos] [quantNotas];
		
		for(int contAluno = 0; contAluno < notas.length; contAluno++) {
			for(int contNota = 0; contNota < notas[contAluno].length; contNota++) {
				System.out.printf("Inrfome a %d nota do %d° aluno: ", contNota+1, contAluno+1);
				notas[contAluno][contNota] = scanner.nextDouble();
				totalNota += notas[contAluno][contNota];
			}
		}
		
		
		media = totalNota / (quantAlunos * quantNotas);
		
		System.out.println("\nA média geral da sala é: "+media);
		
		System.out.println("\nNotas da turma: ");
		for(double nota[] : notas) {
			System.out.println(Arrays.toString(nota));
		}
		
		scanner.close();
	}

}
