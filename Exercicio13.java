package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio13 {
	
	public static void main(String args[]) {
		
		/*
		 * Faça um algoritmo que leia a idade de uma pessoa 
		 * expressa em anos, meses e dias e escreva a idade dessa 
		 * pessoa expressa apenas em dias. Considerar ano com 365 dias 
		 * e mês com 30 dias.
		 */
		
		// Variaveis
		String diasNasc,mesesNasc,anosNasc,dataNascimento;
		int diasNascConv,mesesNascConv,anoNascConv;
		
		String diaAtual,meseAtual,anoAtual,dataAtual;
		int diasConv,mesesConv,anosConv;
		
		int totalAnos,totalMeses,quantTotalDiasEmAnos;
		int totalDeDiasVividos;
		
		
		// DATA DE NASCIMENTO
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			System.out.println("\nPor favor informe a data do seu nascimento neste formato dd/mm/aaaa:");
			dataNascimento = scanner.nextLine();
			
			
		}while(dataNascimento.length() != 10);
		
		diasNasc = dataNascimento.substring(0, 2);
		mesesNasc = dataNascimento.substring(3,5);
		anosNasc = dataNascimento.substring(6,10);
		
		System.out.println("\n//////////////////////////////////////////////");
		System.out.println("DATA DE NASCIMENTO \ndias: "+diasNasc+"\nmeses: "+mesesNasc+"\nanos: "+anosNasc);
		
		diasNascConv = Integer.parseInt(diasNasc);
		mesesNascConv = Integer.parseInt(mesesNasc);
		anoNascConv = Integer.parseInt(anosNasc);
		
		// DATA ATUAL
		do {
			
			System.out.println("\nPor favor informe a data de hoje neste formato dd/mm/aaaa:");
			dataAtual = scanner.nextLine();
			
		} while(dataAtual.length() != 10);
		
		diaAtual = dataAtual.substring(0, 2);
		meseAtual = dataAtual.substring(3,5);
		anoAtual = dataAtual.substring(6,10);
		
		System.out.println("\n//////////////////////////////////////////////");
		System.out.println("DATA ATUAL \ndias: "+diaAtual+"\nmeses: "+meseAtual+"\nanos: "+anoAtual);
		
		diasConv = Integer.parseInt(diaAtual);
		mesesConv = Integer.parseInt(meseAtual);
		anosConv = Integer.parseInt(anoAtual);
		
		// LOGICA 
		totalAnos =  anosConv - (anoNascConv--); 
		
		int quantMesesMaisDiasNasc = ((12 - (mesesNascConv--) * 30) + diasNascConv);
		int quantMesesMaisDiasAtual = ((12 - (mesesConv--) * 30) + diasConv) ;
	
		if(quantMesesMaisDiasAtual > quantMesesMaisDiasNasc)
			totalMeses = quantMesesMaisDiasAtual - quantMesesMaisDiasNasc;
		else {
			totalMeses = quantMesesMaisDiasNasc - quantMesesMaisDiasAtual;
		}
		
		quantTotalDiasEmAnos = totalAnos * 365;
		
		totalDeDiasVividos = (quantTotalDiasEmAnos + totalMeses);
		
		System.out.println("\n//////////////////////////////////////////////");
		System.out.println("Total de dias vividos: "+totalDeDiasVividos);
		
		scanner.close();
	}

}
