package ExerciciosLogica;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio20 {
	
	public static void main(String args[]) {
		
		/*
		 * 8) Efetuar o cálculo da quantidade de litros de combustível gasta 
		 * em uma viagem, utilizando um automóvel que faz 12 Km por litro. 
		 * Para obter o cálculo, o usuário deve fornecer o tempo gasto 
		 * (TEMPO) e a velocidade média (VELOCIDADE) durante a viagem. Desta 
		 * forma, será possível obter a distância percorrida com a fórmula 
		 * DISTANCIA=TEMPO * VELOCIDADE. Possuindo o valor da distância, 
		 * basta calcular a quantidade de litros de combustível utilizada na 
		 * viagem com a fórmula LITROS_USADOS=DISTANCIA/12. Ao final, o 
		 * programa deve apresentar os valores da velocidade média (VELOCIDADE), 
		 * tempo gasto na viagem (TEMPO), a distancia percorrida (DISTANCIA) e a 
		 * quantidade de litros (LITROS_USADOS) utilizada na viagem.
		 */
		
		Double TEMPO, VELOCIDADE, DISTANCIA, LITROS_USADOS;
		
		String tempo;
		
		Scanner entrada = new Scanner(System.in);
		
		// Entrada de dados
		System.out.println("Informe o tempo gasto na viagem: ");
		TEMPO = entrada.nextDouble();
		
		System.out.println("Informe a velocidade média: ");
		VELOCIDADE = entrada.nextDouble();
		
		// Processamento
		DISTANCIA = TEMPO * VELOCIDADE;
		
		LITROS_USADOS = DISTANCIA / 12;
		
		if(TEMPO.toString().length() == 3) {
			tempo = TEMPO.toString() + "0";
		}else {
			tempo = new DecimalFormat(".##").format(TEMPO);
		}
		
		String velocidadeConv = VELOCIDADE.toString();
		String tempoConv = tempo.replace(".", ":");
		String distanciaConv = DISTANCIA.toString();
		String listroUsadosConv = LITROS_USADOS.toString();
		
		// Saida
		System.out.println("\n-----Dados sobre a viagem-----");
		System.out.printf("\nVelocidade média: %s km/h", velocidadeConv);
		System.out.printf("\nTempo gasto na viagem: %S", tempoConv);
		System.out.printf("\nDistância: %s km", distanciaConv);
		System.out.printf("\nQuantidade de litros gasta: %s L",listroUsadosConv);
		
		entrada.close();
	}

}
