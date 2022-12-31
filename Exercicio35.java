package ExerciciosLogica;

public class Exercicio35 {
	
	public static void main(String args[]) {
		
		/*
		 * Elaborar um programa que apresente os valores de 
		 * conversão de graus Celsius em Fahrenheit, de 
		 * 10 em 10 graus, iniciando a contagem em 10 graus 
		 * Celsius e finalizando em 100 graus Celsius. O 
		 * programa deve apresentar os valores das duas 
		 * temperaturas.
		 Fórmula: (0 °C × 9/5) + 32 = 32 °F
		 */
		
		int f;
		
		for(int contC = 10; contC <= 100; contC+=10) {
			f = (contC * 9/5) + 32;
			System.out.printf("%d°C = %d°F\n",contC, f);
		}
		
	}

}
