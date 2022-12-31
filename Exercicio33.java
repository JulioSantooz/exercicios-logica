package ExerciciosLogica;

public class Exercicio33 {
	
	public static void main(String args[]) {
		
		/*
		 * Elaborar um programa que apresente no final o somatório 
		 * dos valores pares existentes na faixa de 1 até 500. 
		 */
		
		int iAntigo, iAtual, somaI;
		
		// RESOLUÇÃO REFATORADA
		int inicializador = 2;
		
		iAntigo = inicializador;
		inicializador+=2;
		iAtual = inicializador;
		somaI = iAntigo + iAtual;
		
		int j = 4;
		while(j < 500) {
			iAntigo = somaI;
			//System.out.println("/////\nI Antigo: "+iAntigo);
			j+=2;
			iAtual = j;
			//System.out.println("/////\nI Atual: "+iAtual);
			somaI = iAntigo + iAtual;
			if(j == 500) {
				System.out.println("Soma dos 500 primeiros números pares: "+somaI);
			}
		}
		
		
		/* RESOLUÇÃO ANTIGA
		int inicializador = 1;
		while(inicializador <= 500) {
			if(inicializador % 2 == 0) {
				//System.out.println(inicializador);
				while(inicializador == 2) {
					iAntigo = inicializador;
					//System.out.println("I Antigo: "+iAntigo);
					inicializador+=2;
					iAtual = inicializador;
					//System.out.println("I Novo:"+iAtual);
					somaI = iAntigo + iAtual;
					//System.out.println("SOMA I: "+somaI);
					
					iAntigo = somaI;
					
					int j = 4;
					while(j < 500) {
						iAntigo = somaI;
						//System.out.println("/////\nI Antigo: "+iAntigo);
						j+=2;
						iAtual = j;
						//System.out.println("/////\nI Atual: "+iAtual);
						somaI = iAntigo + iAtual;
						if(j == 500) {
							System.out.println("Soma dos 500 primeiros números pares: "+somaI);
						}
					}
				}
			}
			inicializador++;
		}
		*/
	}

}
