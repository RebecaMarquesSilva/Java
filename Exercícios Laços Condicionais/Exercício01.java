package br.com.generation.condicionais;
// 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

import java.util.Scanner;

public class Exerc�cio01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3, maiorNum = 0;
		
		System.out.println("Digite um n�mero inteiro: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite um n�mero inteiro: ");
		num2 = leia.nextInt();
		
		System.out.println("Digite um n�mero inteiro: ");
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
		
		System.out.println("O maior n�mero digitado �: " + maiorNum);
		
		leia.close();
	}

}
