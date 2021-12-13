package br.com.generation.exercicios;
/* 1. Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente. */

import java.util.Scanner;

public class Exerc�cio01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double[] valor = new double[5];
		double maiorPontuacao = 0.0;
		
		System.out.println("Digite os 5 valores: ");
		
		for(int i = 0; i < valor.length; i++) {	
			valor[i] = entrada.nextDouble();
			
			if (maiorPontuacao < valor[i]){
				
				maiorPontuacao = valor[i];
			}
		}

		System.out.print(valor[0] + " | " + valor[1] + " | " + valor[2] + 
				" | " + valor[3] + " | " + valor[4]);
	
		System.out.println("\nA maior pontua��o �: " + maiorPontuacao);
		
		entrada.close();
			
	}

}
