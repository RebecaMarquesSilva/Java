package br.com.generation.exercicios;
/* 4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal. */

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double[][] valores = new double[3][3];
		double soma = 0.0, somaDiagonal = 0.0;
		
		for(int l = 0; l < valores.length; l++) {
			for(int c = 0; c < valores[l].length; c++){
							
				System.out.printf("Digite o valor: [%d][%d]: ", l, c);
				
				valores[l][c] = entrada.nextDouble();
				
				soma = soma + valores[l][c];	
			}	
			System.out.println();
		}
		
		for(int l = 0; l < valores.length; l++) {
			for(int c = 0; c < valores[l].length; c++) {
				System.out.print(valores[l][c] + " | ");
			}
			System.out.println();
		}
		
		//Cálculo Diagonal Principal
		somaDiagonal = valores[0][0] + valores[1][1] + valores[2][2];

		//Saída
		System.out.print("\nA soma de todos os valores inseridos é: " + soma);
		System.out.print("\nA soma de todos os valores da diagonal principal é: " + somaDiagonal);
	
		entrada.close();
		
	}

}
