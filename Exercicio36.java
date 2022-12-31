package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio36 {
	
	public static void main(String args[]) {
		
		/*
		 * Elaborar um programa que efetue a leitura de 
		 * 10 valores numéricos e apresente no final o 
		 * total do somatório e a média aritmética dos 
		 * valores lidos.
		 */
		
		double mediaAritmetica, valorInformado, valorAntigo, valorAtual, somaValores;

		double[] valores = new double[10];
		
		Scanner entrada = new Scanner(System.in);
		
		int cont = 0;
		while(cont < valores.length) {
			System.out.println("Informe um valor: ");
			valorInformado = entrada.nextDouble();
			
			valores[cont] = valorInformado;
			cont++;
		}
		
		valorAntigo = valores[0]; 
		valorAtual = valores[1];
		somaValores = valorAntigo + valorAtual;
		
		int cont2 = 2;
		while(cont2 < valores.length) {
			valorAntigo = somaValores;
			valorAtual = valores[cont2];
			somaValores = valorAntigo + valorAtual;
			cont2++;
		}
		
		mediaAritmetica = somaValores / valores.length;
		
		System.out.println("O somatório de todos os valores é: "+somaValores);
		System.out.println("A média aritmética de todo os valores é: "+mediaAritmetica);
		
		entrada.close();
	}

}
