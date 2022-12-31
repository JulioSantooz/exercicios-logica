package ExerciciosLogica;

public class Exercicio32 {
	
	public static void main(String args[]) {
		
		/*
		 * Apresentar o total da soma obtida dos cem primeiros 
		 * números inteiros (1+2+3+4+...+98+99+100). 
		 */
		
		
		System.out.println("A soma dos 100 primeiros números....");
		
		int iAntigo, iAtual, somaI;
		
		// RESOLUÇÃO REFATORADA
		int i = 1;
		iAntigo = i;
		iAtual = i+=1;
		somaI = iAntigo + iAtual;
		
		int j = 2;
		while(j <= 100) {
			iAntigo = somaI;
			//System.out.println("/////\nI Antigo: "+iAntigo);
			j++;
			iAtual = j;
			somaI = iAntigo + iAtual;
			//System.out.println("res"+somaI);
			if(j == 100) {
				System.out.println(somaI);
			}
		}
		
		/* RESOLUÇÃO ANTIGA
		int i = 1;
		while(i <= 1) {
			iAntigo = i;
			//System.out.println("I Antigo: "+iAntigo);
			i++;
			iAtual = i;
			//System.out.println("I Novo:"+iAtual);
			somaI = iAntigo + iAtual;
			//System.out.println("SOMA I: "+somaI);
			
			//iAntigo = somaI;
			
			int j = 2;
			while(j <= 100) {
				iAntigo = somaI;
				//System.out.println("/////\nI Antigo: "+iAntigo);
				j++;
				iAtual = j;
				somaI = iAntigo + iAtual;
				//System.out.println("res"+somaI);
				if(j == 100) {
					System.out.println(somaI);
				}
			}

		}
		*/
	}

}
