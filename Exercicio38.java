package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio38 {
	
	public static void main(String[] args) {
		
		/*
		 * Criar um programa que resolve equações do 
		 * segundo grau (ax2 + bx + c = 0) utilizando 
		 * a fórmula de Bhaskara. Use como exemplo 
		 * a = 1, b = 12 e c = -13. Encontre o delta
		 */
		
		double a, b, c, delta, x1, x2, raizDelta;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, informe o valor de 'A': ");
		a = entrada.nextDouble();
		
		System.out.println("Por favor, informe o valor de 'B': ");
		b = entrada.nextDouble();
		
		System.out.println("Por favor, informe o valor de 'C': ");
		c = entrada.nextDouble();
		
		delta = Math.pow(b, 2) - 4 * a * c;
		
		if(delta < 0) {
			System.out.println("Delta: "+delta);
			System.out.println("O delta é negativo, o que significa que não se tem reposta para o valor de X");
		}else{
			raizDelta = Math.sqrt(delta);
			x1 = (-b + raizDelta) / 2 * a;			
			x2 = (-b - raizDelta) / 2 * a;
			
			System.out.println("Delta: "+delta);
			System.out.println("X1: "+x1);
			System.out.println("X2: "+x2);
		}
		
		entrada.close();
	}

}
