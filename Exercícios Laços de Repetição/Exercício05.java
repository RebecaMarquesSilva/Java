package br.com.generation.repeticao;
/* 5- Crie um programa que leia um n�mero do teclado at� que encontre um
   n�mero igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE) */

import java.util.Scanner;

public class Exerc�cio05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double num, soma = 0;
		
		do {
		System.out.println("Digite um n�mero: ");
		num = entrada.nextInt();
		soma = soma + num;
		}
			while(num != 0); 
		
		System.out.println("A soma dos n�meros digitados �: " + soma);
		
		entrada.close();
	}

}
