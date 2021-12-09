package br.com.generation.condicionais;
// 1- Faça um programa que receba três inteiros e diga qual deles é o maior.

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3, maiorNum = 0;
		
		System.out.println("Digite um número inteiro: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite um número inteiro: ");
		num2 = leia.nextInt();
		
		System.out.println("Digite um número inteiro: ");
		num3 = leia.nextInt();
		
		if(num1 > maiorNum) {
			maiorNum = num1;
		}
		if(num2 > maiorNum) {
			maiorNum = num2;
		}
		if(num3 > maiorNum) {
			maiorNum = num3;
		}
		
		System.out.println("O maior número digitado é: " + maiorNum);
		
		leia.close();
	}

}
