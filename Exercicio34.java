package ExerciciosLogica;

public class Exercicio34 {
	
	public static void main(String args[]) {
		
		/*
		 * Apresentar os resultados das potências de 3, variando 
		 * do expoente 0 até o expoente 15. Deve ser considerado 
		 * que qualquer número elevado a zero é 1, e elevado a 1 
		 * é ele próprio. 
		 */
		
		final int BASE = 3;
		int res;
		
		for(int expoente = 0; expoente <= 15; expoente++) {
			switch (expoente) {
				case 0: 
					res = 1;
					System.out.println(BASE +" Elevado à "+expoente+": "+res);
					break;
				case 1: 
					res = BASE;
					System.out.println(BASE +" Elevado à "+expoente+": "+res);
					break;				
				default:
					res = (int) Math.pow(BASE, expoente);
					System.out.println(BASE +" Elevado à "+expoente+": "+res);
					break;
			}
	
		}

	}
	
}
