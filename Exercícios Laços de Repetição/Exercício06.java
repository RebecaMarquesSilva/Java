package br.com.generation.repeticao;
/* 6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
   final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE) */

import java.util.Scanner;

public class Exerc�cio06 {

	public static void main(String[] args) {
		
		int num, media = 0, contador = 0, soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um n�mero inteiro: ");
			num = leia.nextInt();
			if(num % 3 == 0) {		
			contador++;
			soma = soma + num;				
			}
		}
		while(num != 0);
		
		media = soma / (contador - 1);
				
		System.out.println("A m�dia dos n�meros inseridos m�ltiplos de 3 �: " + media);
		
		leia.close();
		
	}

}