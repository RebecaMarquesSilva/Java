package br.com.generation.condicionais;
/* 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
   número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
   ímpar exiba o número elevado ao quadrado. */

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double num, raiz, potencia;
			
		System.out.println("Digite um número: ");
		num = entrada.nextInt();
		
		if (num % 2 == 0) {
			
			raiz = Math.sqrt(num);
			
			System.out.println(num + " é um número par e sua raiz quadrada é: " + raiz);
		}
		else if (num % 2 == 1) {
			
			potencia = Math.pow(num, 2);
			
			System.out.println(num + " é um número ímpar e seu valor elevado à segunda potência é: " + potencia);
		}
		
		entrada.close();

	}

}
