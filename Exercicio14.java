package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio14 {
	
	public static void main(String args[]) {
		
		/**
		 * Escreva um algoritmo para ler o número total de eleitores 
		 * de um município, o número de votos brancos, nulos e válidos. 
		 * Calcular e escrever o percentual que cada um representa em 
		 * relação ao total de eleitores.
		 */
		
		String nomeMunicipio;
		double totalEleitores, votosNulos, votosBrancos, votosValidos;
		double percNulos, percBrancos, percValidos;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o seu Município: ");
		nomeMunicipio = scanner.nextLine();
		
		System.out.println("Informe o número total de eleitores: ");
		totalEleitores = scanner.nextDouble();
		
		System.out.println("Informe o número de votos brancos: ");
		votosBrancos = scanner.nextDouble();
		
		System.out.println("Informe o número de votos nulos: ");
		votosNulos = scanner.nextDouble();
		
		System.out.println("Informe o número de votos válidos: ");
		votosValidos = scanner.nextDouble();
		
		percBrancos = ((votosBrancos * 100) / totalEleitores);
		percNulos = ( (votosNulos * 100) / totalEleitores);
		percValidos = ((votosValidos * 100) / totalEleitores);
		
		//Resposta
		System.out.println("\n//////////////////////////////////////////");
		System.out.println("Município: "+nomeMunicipio+".");
		System.out.println("Votos Brancos: "+percBrancos+"%.");
		System.out.println("Votos Nulos: "+percNulos+"%.");
		System.out.println("Votos Válidos: "+percValidos+"%.");
		
		scanner.close();
	}

}
