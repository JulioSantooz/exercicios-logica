package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio43 {
	
	public static void main(String[] args) {
		
		/*
		 * Construa um programa que seja capaz de calcular a
		 * media das notas de uma turma sendo que a quantidade de
		 * notas vai depender da quantidade que o usuario informar. 
		 * O usuario tem que informar notas validas, ou seja, 
		 * (nota >= 0 e nota <= 10), sempre que o usuario informar 
		 * uma nota valida, esse valor tem que ser incrementado em 
		 * uma variavel chamada 'total', ou seja, esta variavel deve 
		 * armazenar a soma de todas as notas, o programa também tem 
		 * que informar quantas notas validas foram digitadas alem
		 * de informar a media de todas as notas. Quando o usuário 
		 * digitar -1 o programa finaliza e informa os resultados.
		 * Dica: O loop é indeterminado.
		 */
		
		double notaValida = 0, total = 0, media = 0;
		int quantNotaValida = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(notaValida != -1) {
			System.out.println("Informe uma nota ou digite -1 para finalizar programa: ");
			notaValida = scanner.nextDouble();
			
			if((notaValida >= 0 && notaValida <= 10)) {
				total = total + notaValida;
				quantNotaValida++;
			}else if(notaValida != -1){
				System.out.println("Por favor, informe uma nota  válida entre 0 e 10.");
			}
		};
		
		media = total / quantNotaValida;
		
		System.out.println("Quantidade de notas válidas: "+quantNotaValida);
		System.out.printf("Média: %.1f",media);
		
		scanner.close();
	}

}
