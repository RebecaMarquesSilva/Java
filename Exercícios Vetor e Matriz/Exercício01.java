package br.com.generation.exercicios;
/* 1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. */

import java.util.Scanner;

public class Exercício01 {

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
	
		System.out.println("\nA maior pontuação é: " + maiorPontuacao);
		
		entrada.close();
			
	}

}
